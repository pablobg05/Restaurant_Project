
package Factura;

import com.lowagie.text.*;
import com.lowagie.text.pdf.*;
import java.io.FileOutputStream;
import java.sql.*;
import java.util.Date;

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

            document.add(new Paragraph("Factura - Mesa " + noMesa, FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16)));
            document.add(new Paragraph("Fecha: " + new Date().toString()));
            document.add(new Paragraph(" ")); // espacio

            PdfPTable table = new PdfPTable(4);
            table.addCell("Producto");
            table.addCell("Cantidad");
            table.addCell("Precio Unitario");
            table.addCell("Subtotal");

            double total = 0;

            while (rs.next()) {
                String producto = rs.getString("nombre_receta");
                int cantidad = rs.getInt("cantidad");
                double precio = rs.getDouble("precio");
                double subtotal = precio * cantidad;

                table.addCell(producto);
                table.addCell(String.valueOf(cantidad));
                table.addCell(String.format("$%.2f", precio));
                table.addCell(String.format("$%.2f", subtotal));

                total += subtotal;
            }

            document.add(table);

            document.add(new Paragraph(" "));
            document.add(new Paragraph("TOTAL: $" + String.format("%.2f", total), FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14)));

            document.close();
            System.out.println("Factura generada exitosamente en: " + rutaSalida);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
