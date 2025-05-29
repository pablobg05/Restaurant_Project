package Factura;

import conexion.CreateConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FacturaDAO {
    private CreateConnection cn = new CreateConnection();

    public List<OrdenFactura> obtenerOrdenesPorMesa(int noMesa) {
        List<OrdenFactura> lista = new ArrayList<>();
        String sql = "SELECT o.id_orden, o.no_mesa, o.id_receta, r.nombre_receta, r.precio, o.cantidad, o.fecha_hora " +
                     "FROM ordenes o JOIN recetas r ON o.id_receta = r.id_receta " +
                     "WHERE o.no_mesa = ? ORDER BY o.fecha_hora DESC";

        try (Connection conn = cn.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, noMesa);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                OrdenFactura orden = new OrdenFactura(
                    rs.getInt("id_orden"),
                    rs.getInt("no_mesa"),
                    rs.getInt("id_receta"),
                    rs.getString("nombre_receta"),
                    rs.getDouble("precio"),
                    rs.getInt("cantidad"),
                    rs.getTimestamp("fecha_hora")
                );
                lista.add(orden);
            }

        } catch (SQLException e) {
            System.out.println("Error en obtenerOrdenesPorMesa: " + e.getMessage());
        }
        return lista;
    }
}
