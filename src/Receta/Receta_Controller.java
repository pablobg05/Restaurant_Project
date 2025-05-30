package Receta;
import java.sql.*;
import java.util.*;

public class Receta_Controller {
    private final RecetaDAO dao = new RecetaDAO();
    
    public List<Receta> getRecetas() throws SQLException{
        return dao.getRecetas();
    }
    
    public Receta getRecetaById(int id) throws SQLException{
        return dao.getRecetaById(id);
    }
    
    public boolean setReceta(int id_producto, double cantidad, String categoria) throws SQLException{
        Receta rec = new Receta(id_producto, cantidad, categoria);
        return dao.setReceta(rec);
    }
    
    public boolean updateReceta(int id_receta,int id_producto, double cantidad, String categoria) throws  SQLException{
        Receta rec = new Receta(id_receta, id_producto, cantidad, categoria);
        return dao.updateReceta(rec);
    }
    
    public boolean deleteReceta(int id) throws SQLException{
        Receta rec = new Receta(id);
        return dao.deleteReceta(rec);
    }
}
