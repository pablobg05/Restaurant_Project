/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InventarioSucursal;

import java.sql.*;
import java.util.*;

public class InvSuc_Controller {
    private final InvSucDAO dao = new InvSucDAO();
    
    public List<InvSuc_Model> getInventario() throws SQLException{
        return dao.getInventario();
    }
    
    public InvSuc_Model getInventarioById(int id) throws SQLException{
        return dao.getInventarioById(id);
    }
    
    public void setInventario(int producto, int sucursal) throws SQLException{
        InvSuc_Model inv = new InvSuc_Model(producto, sucursal, "");
        dao.setInventario(inv);
    }
    
    public void deleteInventario(int id) throws SQLException{
        InvSuc_Model inv = new InvSuc_Model(id);
        dao.deleteInventario(inv);
    }
    
    public void updateInventario(int id, int producto, int sucursal, int cantidad) throws SQLException{
        InvSuc_Model inv = new InvSuc_Model(id, producto, sucursal, cantidad);
        dao.updateInventario(inv);
    }
    
    public boolean updateStock(int id, int cantidad) throws SQLException{
        InvSuc_Model inv = new InvSuc_Model(id, cantidad);
        return dao.updateStock(inv);
    }
    
    public int getStockById(int id) throws SQLException{
        InvSuc_Model inv = new InvSuc_Model(id);
        return dao.getStockById(inv);
    }
}
