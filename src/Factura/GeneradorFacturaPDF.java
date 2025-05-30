
package Factura;

import com.lowagie.text.*;
import com.lowagie.text.pdf.*;
import java.io.FileOutputStream;
import java.sql.*;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class GeneradorFacturaPDF {

    private Connection conn;

    public GeneradorFacturaPDF(Connection conn) {
        this.conn = conn;
    }

    public void generarFacturaParaMesa(int noMesa, String rutaSalida) {
        String sql = "SELECT o.id_orden, o.no_mesa, o.id_receta, r.nombre_receta, r.precio, o.cantidad, o.fecha_hora " +
                     "FROM ordenes o " +
                     "JOIN recetas r ON o.id_receta = r.id_receta " +
                     "WHERE o.no_mesa = ? " +
                     "ORDER BY o.fecha_hora DESC";

        try (
            PreparedStatement stmt = conn.prepareStatement(sql);
            FileOutputStream fos = new FileOutputStream(rutaSalida)
        ) {
            stmt.setInt(1, noMesa);
            ResultSet rs = stmt.executeQuery();

            Document document = new Document();
            PdfWriter.getInstance(document, fos);
            document.open();

            // Título
            Font tituloFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18);
            Paragraph titulo = new Paragraph("Factura - Mesa " + noMesa, tituloFont);
            titulo.setAlignment(Element.ALIGN_CENTER);
            document.add(titulo);

            // Fecha
            Font fechaFont = FontFactory.getFont(FontFactory.HELVETICA, 12);
            Paragraph fecha = new Paragraph("Fecha: " + new Date().toString(), fechaFont);
            fecha.setAlignment(Element.ALIGN_CENTER);
            document.add(fecha);

            document.add(new Paragraph(" ")); // espacio

            // Tabla con 4 columnas
            PdfPTable table = new PdfPTable(4);
            table.setWidthPercentage(100);
            table.setWidths(new float[]{4, 1, 2, 2});

            // Encabezados de la tabla
            Font headerFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12);
            table.addCell(new PdfPCell(new Phrase("Producto", headerFont)));
            table.addCell(new PdfPCell(new Phrase("Cantidad", headerFont)));
            table.addCell(new PdfPCell(new Phrase("Precio Unitario", headerFont)));
            table.addCell(new PdfPCell(new Phrase("Subtotal", headerFont)));

            double total = 0;

            while (rs.next()) {
                String producto = rs.getString("nombre_receta");
                int cantidad = rs.getInt("cantidad");
                double precio = rs.getDouble("precio");
                double subtotal = precio * cantidad;

                table.addCell(new PdfPCell(new Phrase(producto)));
                table.addCell(new PdfPCell(new Phrase(String.valueOf(cantidad))));
                table.addCell(new PdfPCell(new Phrase(String.format("Q %.2f", precio))));
                table.addCell(new PdfPCell(new Phrase(String.format("Q %.2f", subtotal))));

                total += subtotal;
            }

            document.add(table);

            document.add(new Paragraph(" "));

            // Total
            Font totalFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14);
            Paragraph totalParrafo = new Paragraph("TOTAL: Q " + String.format("%.2f", total), totalFont);
            totalParrafo.setAlignment(Element.ALIGN_RIGHT);
            document.add(totalParrafo);

            document.close();
            System.out.println("Factura generada exitosamente en: " + rutaSalida);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
