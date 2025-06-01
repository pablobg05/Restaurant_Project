
package Inventario;

import conexion.CreateConnection;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InventarioDAOA {
    private CreateConnection config = new CreateConnection();
    Connection con;
    ResultSet rs;
    PreparedStatement ps;
    
    String query;
    
    public List<Inventario_ModelA> obtenerTodos() {
        List<Inventario_ModelA> lista = new ArrayList<>();
        query = "select * from inventario";
        
        try(Connection conn = config.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery()){
            
            while (rs.next()){
                Inventario_ModelA prd = new Inventario_ModelA(
                rs.getInt("id"),
                rs.getString("marca"),
                rs.getString("ingrediente"),
                rs.getDouble("precio"),
                rs.getString("descripcion"),
                rs.getInt("stock"),
                rs.getInt("compras")
                );
            lista.add(prd);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return lista;
    }
    
    public Inventario_ModelA obtenerUno(int id){
        Inventario_ModelA prd = new Inventario_ModelA();
        
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
                prd.setStock(rs.getInt(6));
                prd.setCompras(rs.getInt(7));
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
    
    public boolean guardar (Inventario_ModelA prd){
        try {
//            query = "insert into producto (marca, producto, precio, descripcion) values (?,?,?,?);";
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
            Logger.getLogger(InventarioDAOA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    

    

    public boolean eliminar (Inventario_ModelA prd){
        try {
//            query = "delete from producto where id= ?;";
            query = "delete from inventario where id= ?;";
            con = config.getConnection();
            ps = con.prepareStatement(query);
            
            ps.setInt(1, prd.getId());
            ps.executeUpdate();
            
            ps.close();
            con.close(); 
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(InventarioDAOA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean actualizarInformacion(Inventario_ModelA prd, int comprasNuevas, int stockNuevasEntradas, double nuevoPrecio, String descripcionActual){
        String query = "UPDATE inventario SET stock = ?, precio = ?, descripcion = ?, compras = ? WHERE id = ?";
    
        try (Connection conn = config.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            int stock = 0;
            double precio = 0;
            String descripcion = null;
            int compras = 0;
            int id = 0;
            
            stmt.setInt(1, stock);         // nuevo stock
            stmt.setDouble(2, precio);
            stmt.setString(3, descripcion);
            stmt.setInt(4, compras);
            stmt.setInt(5, id);

            int filas = stmt.executeUpdate();
            return filas > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
        public boolean actualizarSTOCK(Inventario_ModelA producto, int cantidadASumar) {
        String query = "UPDATE inventario SET stock = stock + ? WHERE id = ?";

        try (Connection conn = config.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, cantidadASumar);
            stmt.setInt(2, producto.getId());

            int filas = stmt.executeUpdate();
            return filas > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    
    public int obtenerStockPorID(int id) {
        int stock = 0;
        String query = "SELECT stock FROM inventario WHERE id = ?";

        try (Connection conn = config.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    stock = rs.getInt("stock");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return stock;
    }
    
    public boolean reemplazarSTOCK(int id, int nuevoStock, double precio, String descripcion, int compras) {
        String query = "UPDATE inventario SET stock = ?, precio = ?, descripcion = ?, compras = ? WHERE id = ?";

        try (Connection conn = config.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, nuevoStock);
            stmt.setDouble(2, precio);
            stmt.setString(3, descripcion);
            stmt.setInt(4, compras);
            stmt.setInt(5, id);

            int filas = stmt.executeUpdate();
            return filas > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
        
}
