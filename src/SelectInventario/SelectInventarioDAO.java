
package SelectInventario;

import Inventario.*;
import conexion.CreateConnection;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SelectInventarioDAO {
    private CreateConnection config = new CreateConnection();
    Connection con;
    ResultSet rs;
    PreparedStatement ps;
    
    String query;
    
    public List<SelectInventario_Model> obtenerTodos() {
        List<SelectInventario_Model> lista = new ArrayList<>();
        query = "select * from inventario";
        
        try(Connection conn = config.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery()){
            
            while (rs.next()){
                SelectInventario_Model prd = new SelectInventario_Model(
                rs.getInt("id"),
                rs.getString("marca"),
                rs.getString("ingrediente"),
                rs.getDouble("precio"),
                rs.getString("descripcion")

                );
            lista.add(prd);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return lista;
    }
    
    public SelectInventario_Model obtenerUno(int id){
        SelectInventario_Model prd = new SelectInventario_Model();
        
        try {
             
//            query = "select * from producto where id= ?";
            query = "select * from inventario where id= ?";
            con = config.getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            while (rs.next()){
                prd.setId(rs.getInt(1));
                prd.setMarca(rs.getString(2));
                prd.setIngredientes(rs.getString(3));
                prd.setPrecio(rs.getInt(4));
                prd.setDescripcion(rs.getString(5));

            }
            rs.close();
            ps.close();
            con.close();
            
            return prd;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return prd;
    }
    
    public boolean guardar (SelectInventario_Model prd){
        try {
            query = "insert into inventario (marca, ingrediente, precio, descripcion) values (?,?,?,?);";
            con = config.getConnection();
            ps = con.prepareStatement(query);
            
            ps.setString(1, prd.getMarca());
            ps.setString(2, prd.getIngredientes());
            ps.setDouble(3, prd.getPrecio());
            ps.setString(4, prd.getDescripcion());
            
            ps.executeUpdate();
            
            ps.close();
            con.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SelectInventarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    

    

    public boolean eliminar (SelectInventario_Model prd){
        try {
            query = "delete from inventario where id= ?;";
            con = config.getConnection();
            ps = con.prepareStatement(query);
            
            ps.setInt(1, prd.getId());
            ps.executeUpdate();
            
            ps.close();
            con.close(); 
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SelectInventarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean actualizarInformacion(SelectInventario_Model prd, int comprasNuevas, /*int stockNuevasEntradas,*/ double nuevoPrecio, String descripcionActual){
        String query = "UPDATE inventario SET precio = ?, descripcion = ? WHERE id = ?";
    
        try (Connection conn = config.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
//            int stock = 0;
            double precio = 0;
            String descripcion = null;

            int id = 0;
            
//            stmt.setInt(1, stock);         // nuevo stock
            stmt.setDouble(1, precio);
            stmt.setString(2, descripcion);

            stmt.setInt(3, id);

            int filas = stmt.executeUpdate();
            return filas > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    
    public boolean reemplazarSTOCK(int id, /*int nuevoStock,*/ double precio, String descripcion, int compras) {
        String query = "UPDATE inventario SET precio = ?, descripcion = ? WHERE id = ?";

        try (Connection conn = config.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

//            stmt.setInt(1, nuevoStock);
            stmt.setDouble(1, precio);
            stmt.setString(2, descripcion);
            stmt.setInt(3, id);

            int filas = stmt.executeUpdate();
            return filas > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
        
}
