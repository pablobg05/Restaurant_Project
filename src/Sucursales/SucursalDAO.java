
package Sucursales;
import Producto.*;
import conexion.CreateConnection;
import conexion.CreateConnection;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SucursalDAO {
    private CreateConnection config = new CreateConnection();
    Connection con;
    ResultSet rs;
    PreparedStatement ps;
    
    String query;
    
    public List<Sucursal_Model> obtenerTodos() {
        List<Sucursal_Model> lista = new ArrayList<>();
        query = "SELECT * FROM Sucursales";

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
                    rs.getString("gerente"),
                    rs.getDate("fechaApertura")
                );
                lista.add(suc);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    public Sucursal_Model obtenerUno(int id) {
        Sucursal_Model suc = new Sucursal_Model();

        try {
            query = "SELECT * FROM Sucursales WHERE id = ?";
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
                suc.setGerente(rs.getString("gerente"));
                suc.setFechaApertura(rs.getDate("fechaApertura"));
            }
            rs.close();
            ps.close();
            con.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return suc;
    }
    
     public boolean guardar(Sucursal_Model suc) {
        try {
            query = "INSERT INTO Sucursales (nombre, direccion, telefono, correo, gerente, fechaApertura) VALUES (?, ?, ?, ?, ?,NOW())";
            con = config.getConnection();
            ps = con.prepareStatement(query);


            ps.setString(1, suc.getNombre());
            ps.setString(2, suc.getDireccion());
            ps.setString(3, suc.getTelefono());
            ps.setString(4, suc.getCorreo());
            ps.setString(5, suc.getGerente());


            ps.executeUpdate();

            ps.close();
            con.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SucursalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean eliminar(Sucursal_Model suc) {
        try {
            query = "DELETE FROM Sucursales WHERE id = ?";
            con = config.getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, suc.getId());
            ps.executeUpdate();

            ps.close();
            con.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SucursalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    
    public boolean actualizar(Sucursal_Model suc) {
        try {
            query = "UPDATE Sucursales SET telefono = ?, gerente = ? WHERE id = ?";
            con = config.getConnection();
            ps = con.prepareStatement(query);


            ps.setString(1, suc.getTelefono());
            ps.setString(2, suc.getGerente());
            ps.setInt(3, suc.getId());

            ps.executeUpdate();

            ps.close();
            con.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SucursalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

        
}
