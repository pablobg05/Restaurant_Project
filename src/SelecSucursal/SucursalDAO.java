
package SelecSucursal;
import conexion.CreateConnection;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class SucursalDAO {
    private final CreateConnection config = new CreateConnection();
    Connection con;
    PreparedStatement ps;
    
    String query;
    
    public List<Sucursal_Model> obtenerTodos() {
        List<Sucursal_Model> lista = new ArrayList<>();
        query = "SELECT * FROM sucursal";

        try (Connection conn = config.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Sucursal_Model suc = new Sucursal_Model(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("direccion"),
                    rs.getString("telefono"),
                    rs.getString("correo"),
                    rs.getInt("id_gerente"),
                    rs.getDate("fecha_apertura")
                );
                lista.add(suc);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }
    
    public Sucursal_Model obtenerUno(int id) {
        Sucursal_Model suc = new Sucursal_Model();
        ResultSet rs;

        try {
            query = "SELECT * FROM sucursal WHERE id = ?";
            con = config.getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {
                suc.setId(rs.getInt("id"));
                suc.setNombre(rs.getString("nombre"));
                suc.setDireccion(rs.getString("direccion"));
                suc.setTelefono(rs.getString("telefono"));
                suc.setCorreo(rs.getString("correo"));
                suc.setGerente(rs.getInt("gerente"));
                suc.setFechaApertura(rs.getDate("fecha_apertura"));
            }
            rs.close();
            ps.close();
            con.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return suc;
    }        
}
