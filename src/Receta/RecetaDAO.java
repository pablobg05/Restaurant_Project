package Receta;
import conexion.CreateConnection;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class RecetaDAO {
    private CreateConnection config = new CreateConnection();
    Connection cn;
    ResultSet rs;
    PreparedStatement ps;
    
    String query;
    
    public List<Receta> getRecetas(){
        List<Receta> lista = new ArrayList<>();
        query = "select * from receta_detalle";
        
        try(Connection con = config.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery()){
            
            while(rs.next()){
                Receta rec = new Receta(
                rs.getInt("id_receta"),
                rs.getInt("id"),
                rs.getDouble("cantidad"),
                rs.getString("categoria")
                );
                lista.add(rec);
            }
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        return lista;
    }
    
    public Receta getRecetaById(int id){
        Receta rec = new Receta();
        query = "select * from receta_detalle where id = ?";
        
        try{
            cn = config.getConnection();
            ps = cn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            while(rs.next()){
                rec.setId_receta(rs.getInt("id_receta"));
                rec.setId_producto(rs.getInt("id"));
                rec.setCantidad(rs.getDouble("cantidad"));
                rec.setCategoria(rs.getString("categoria"));
            }
            
            rs.close();
            ps.close();
            cn.close();
            
            return rec;
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        return rec;
    }
    
    public boolean setReceta(Receta rec){
        query = "insert into receta_detalle(id, cantidad, categoria) values(?,?,?)";
        
        try{
            cn = config.getConnection();
            ps = cn.prepareStatement(query);
            
            ps.setInt(1, rec.getId_producto());
            ps.setDouble(2, rec.getCantidad());
            ps.setString(3, rec.getCategoria());
            
            ps.executeQuery();
            return true;
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return false;
    }
    
    public boolean updateReceta(Receta rec){
        query = "update receta_detalle set id = ?, cantidad = ?, categoria = ? where id = ?";
        
        try{
            cn = config.getConnection();
            ps = cn.prepareStatement(query);
            
            ps.setInt(1, rec.getId_producto());
            ps.setDouble(1, rec.getCantidad());
            ps.setString(1, rec.getCategoria());
            
            ps.executeUpdate();
            ps.close();
            cn.close();
            return true;
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return false;
    }
    
    public boolean deleteReceta(Receta rec){
        query = "delete from receta_detalle where id = ?";
        
        try{
            cn = config.getConnection();
            ps = cn.prepareStatement(query);
            
            ps.setInt(1, rec.getId_receta());
            
            ps.executeUpdate();
            ps.close();
            cn.close();
            
            return true;
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return false;
    }
}
