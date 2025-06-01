
package Sucursal;
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
        query = "SELECT * FROM Sucursal";

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
            query = "SELECT * FROM Sucursal WHERE id = ?";
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
                suc.setGerente(rs.getInt("id_gerente"));
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
    
     public boolean guardar(Sucursal_Model suc) {
        try {
            query = "INSERT INTO Sucursal (nombre, direccion, telefono, correo, id_gerente, fecha_apertura) VALUES (?, ?, ?, ?, ?)";
            con = config.getConnection();
            ps = con.prepareStatement(query);


            ps.setString(1, suc.getNombre());
            ps.setString(2, suc.getDireccion());
            ps.setString(3, suc.getTelefono());
            ps.setString(4, suc.getCorreo());
            ps.setInt(5, suc.getGerente());


            ps.executeUpdate();

            ps.close();
            con.close();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    public boolean eliminar(Sucursal_Model suc) {
        try {
            query = "DELETE FROM Sucursal WHERE id = ?";
            con = config.getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, suc.getId());
            ps.executeUpdate();

            ps.close();
            con.close();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    
    public boolean actualizar(Sucursal_Model suc) {
        try {
            query = "UPDATE Sucursal SET telefono = ?, id_gerente = ?, correo = ? WHERE id = ?";
            con = config.getConnection();
            ps = con.prepareStatement(query);


            ps.setString(1, suc.getTelefono());
            ps.setInt(2, suc.getGerente());
            ps.setString(3, suc.getCorreo());
            ps.setInt(4, suc.getId());

            ps.executeUpdate();

            ps.close();
            con.close();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

        
}
