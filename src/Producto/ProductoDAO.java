
package Producto;
import conexion.CreateConnection;
import conexion.CreateConnection;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductoDAO {
    private CreateConnection config = new CreateConnection();
    Connection con;
    ResultSet rs;
    PreparedStatement ps;
    
    String query;
    
    public List<Producto_Model> obtenerTodos() {
        List<Producto_Model> lista = new ArrayList<>();
        query = "select * from producto";
        
        try(Connection conn = config.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery()){
            
            while (rs.next()){
                Producto_Model prd = new Producto_Model(
                rs.getInt("id"),
                rs.getString("marca"),
                rs.getString("producto"),
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
    
    public Producto_Model obtenerUno(int id){
        Producto_Model prd = new Producto_Model();
        
        try {
             
//            query = "select * from producto where id= ?";
            query = "select * from public.producto where id= ?";
            con = config.getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            while (rs.next()){
                prd.setId(rs.getInt(1));
                prd.setMarca(rs.getString(2));
                prd.setProducto(rs.getString(3));
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
    
    public boolean guardar (Producto_Model prd){
        try {
//            query = "insert into producto (marca, producto, precio, descripcion) values (?,?,?,?);";
            query = "insert into public.producto (marca, producto, precio, descripcion) values (?,?,?,?);";
            con = config.getConnection();
            ps = con.prepareStatement(query);
            
            ps.setString(1, prd.getMarca());
            ps.setString(2, prd.getProducto());
            ps.setDouble(3, prd.getPrecio());
            ps.setString(4, prd.getDescripcion());
            
            ps.executeUpdate();
            
            ps.close();
            con.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    

    

    public boolean eliminar (Producto_Model prd){
        try {
//            query = "delete from producto where id= ?;";
            query = "delete from public.producto where id= ?;";
            con = config.getConnection();
            ps = con.prepareStatement(query);
            
            ps.setInt(1, prd.getId());
            ps.executeUpdate();
            
            ps.close();
            con.close(); 
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean actualizarInformacion(Producto_Model prd, int comprasNuevas, int stockNuevasEntradas, double nuevoPrecio, String descripcionActual){
        try {
            if (nuevoPrecio <= 0 || stockNuevasEntradas < 0 || comprasNuevas < 0) {
                return false;
            }

            int nuevoStock = (prd.getStock() - comprasNuevas);
            nuevoStock =  prd.getStock()+stockNuevasEntradas;
            int nuevasCompras = prd.getCompras() + comprasNuevas;

            if (nuevoStock < 0) {
                return false;
            }

            query = "UPDATE public.producto SET precio = ?, stock = ?, compras = ?, descripcion = ? WHERE id = ?;";
            con = config.getConnection();
            ps = con.prepareStatement(query);

            ps.setDouble(1, nuevoPrecio);
            ps.setInt(2, nuevoStock);
            ps.setInt(3, nuevasCompras);
            ps.setString(4, descripcionActual);
            ps.setInt(5, prd.getId());

            ps.executeUpdate();
            ps.close();
            con.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

        
}
