
package Inventario;

import conexion.CreateConnection;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InventarioDAO {
    private CreateConnection config = new CreateConnection();
    Connection con;
    ResultSet rs;
    PreparedStatement ps;
    
    String query;
    
    public List<Inventario_Model> obtenerTodos() {
        List<Inventario_Model> lista = new ArrayList<>();
        query = "select * from inventario";
        
        try(Connection conn = config.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery()){
            
            while (rs.next()){
                Inventario_Model prd = new Inventario_Model(
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
    
    public Inventario_Model obtenerUno(int id){
        Inventario_Model prd = new Inventario_Model();
        
        try {
             
//            query = "select * from producto where id= ?";
            query = "select * from public.inventario where id= ?";
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
    
    public boolean guardar (Inventario_Model prd){
        try {
//            query = "insert into producto (marca, producto, precio, descripcion) values (?,?,?,?);";
            query = "insert into public.inventario (marca, ingrediente, precio, descripcion) values (?,?,?,?);";
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
            Logger.getLogger(InventarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    

    

    public boolean eliminar (Inventario_Model prd){
        try {
//            query = "delete from producto where id= ?;";
            query = "delete from public.inventario where id= ?;";
            con = config.getConnection();
            ps = con.prepareStatement(query);
            
            ps.setInt(1, prd.getId());
            ps.executeUpdate();
            
            ps.close();
            con.close(); 
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(InventarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean actualizarInformacion(Inventario_Model prd, int comprasNuevas, int stockNuevasEntradas, double nuevoPrecio, String descripcionActual){
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

            query = "UPDATE public.ingrediente SET precio = ?, stock = ?, compras = ?, descripcion = ? WHERE id = ?;";
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
            Logger.getLogger(InventarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    
    public boolean actualizarSTOCK(Inventario_Model prd, int cantidadASumar){
        try {
            // Obtener el stock actual
            String selectQuery = "SELECT stock FROM public.ingrediente WHERE id = ?;";
            con = config.getConnection();
            ps = con.prepareStatement(selectQuery);
            ps.setInt(1, prd.getId());
            rs = ps.executeQuery();

            int stockActual = 0;
            if (rs.next()) {
                stockActual = rs.getInt("stock");
            }

            rs.close();
            ps.close();

            // Calcular nuevo stock
            int nuevoStock = stockActual + cantidadASumar;

            // Actualizar el stock en la base de datos
            String updateQuery = "UPDATE public.ingrediente SET stock = ? WHERE id = ?;";
            ps = con.prepareStatement(updateQuery);
            ps.setInt(1, nuevoStock);
            ps.setInt(2, prd.getId());

            ps.executeUpdate();
            ps.close();
            con.close();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(InventarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

        
}
