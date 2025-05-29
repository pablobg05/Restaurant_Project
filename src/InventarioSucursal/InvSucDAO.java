package InventarioSucursal;

import java.sql.*;
import java.util.*;
import conexion.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InvSucDAO {
    private final CreateConnection config = new CreateConnection();
    Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    
    String query;
    
    public List<InvSuc_Model> getInventario(){
        List<InvSuc_Model> lista = new ArrayList<>();
        query = "select * from inventario_sucursal";
        
        try(Connection conn = config.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery()){
            
            
            while(rs.next()){
                InvSuc_Model inv = new InvSuc_Model(
                  rs.getInt("id"),
                  rs.getInt("producto"),
                  rs.getInt("sucursal"),
                  rs.getInt("cantidad")
                );
                lista.add(inv);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        
        return lista;
    }
    
    public InvSuc_Model getInventarioById(int id){
        InvSuc_Model inv = new InvSuc_Model();
        
        try{
            query = "select * from inventario_sucursal where id = ?";
            cn = config.getConnection();
            ps = cn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            if(rs.next()){
                inv.setId(rs.getInt("id"));
                inv.setProducto(rs.getInt("producto"));
                inv.setSucursal(rs.getInt("sucursal"));
                inv.setCantidad(rs.getInt("cantidad"));
            }
            rs.close();
            ps.close();
            cn.close();
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        
        return inv;
    }
    
    public void setInventario(InvSuc_Model inv){
        try{
            query = "insert into inventario_sucursal(producto, sucursal) values(?,?)";
            cn = config.getConnection();
            ps = cn.prepareStatement(query);
            System.out.println("Valor ingresado en txtIdProducto: " + inv.getProducto());
            System.out.println("Valor ingresado en txtIdSucursal: " + inv.getSucursal());
            
            ps.setInt(1, inv.getProducto());
            ps.setInt(2, inv.getSucursal());
            
            ps.executeUpdate();
            
            ps.close();
            cn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void deleteInventario(InvSuc_Model inv){
        try {
            query = "delete from inventario_sucursal where id = ?";
            cn = config.getConnection();
            ps = cn.prepareStatement(query);
            
            ps.setInt(1, inv.getId());
            
            ps.executeUpdate();
            
            ps.close();
            cn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void updateInventario(InvSuc_Model inv){
        try{
            query = "update inventario_sucursal set producto, sucursal, cantidad = ? where id = ?";
            cn = config.getConnection();
            ps = cn.prepareStatement(query);
            
            ps.setInt(1, inv.getProducto());
            ps.setInt(2, inv.getSucursal());
            ps.setInt(3, inv.getCantidad());
            ps.setInt(4, inv.getId());
            
            ps.close();
            cn.close();
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public boolean updateStock(InvSuc_Model inv){
        try{
            query = "update inventario_sucursal set cantidad = ? where id = ?";
            cn = config.getConnection();
            ps = cn.prepareStatement(query);
            
            ps.setInt(1, inv.getCantidad());
            ps.setInt(2, inv.getId());
            
            ps.close();
            cn.close();
            
            return true;
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        return false;
    }
    
    public int getStockById(InvSuc_Model inv){
        int stock = 0;
        String query = "SELECT stock FROM inventario WHERE id = ?";

        try (Connection conn = config.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, inv.getId());
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    stock = rs.getInt("stock");
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return stock;
    }
}
