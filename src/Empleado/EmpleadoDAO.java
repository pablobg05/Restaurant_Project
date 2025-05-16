package Empleado;

import conexion.CreateConnection;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
public class EmpleadoDAO {
    private CreateConnection connFactory = new CreateConnection();
    
    public List<Empleado_Model> obtenerTodos() {
        List<Empleado_Model> lista = new ArrayList<>();
        String sql = "SELECT * FROM empleados";
        
        try(Connection conn = connFactory.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery()){
            
            while (rs.next()){
                Empleado_Model emp = new Empleado_Model(
                rs.getInt("id"),
                rs.getString("nombre"),
                rs.getString("apellido"),
                rs.getString("puesto"),
                rs.getDouble("salario"),
                rs.getDate("fecha_ingreso"),
                rs.getBoolean("estado")
                );
            lista.add(emp);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return lista;
    }
    
    public boolean guardar(Empleado_Model emp) throws SQLException{
        String sql = "INSERT INTO empleados(nombre, apellido, puesto, salario, fecha_ingreso) VALUES(?,?,?,?,?)";
        
        try(Connection conn = connFactory.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            
            stmt.setString(1, emp.getNombre());
            stmt.setString(2, emp.getApellido());
            stmt.setString(3, emp.getPuesto());
            stmt.setDouble(4, emp.getSalario());
            stmt.setDate(5, emp.getFecha_ingreso());
            
            stmt.executeUpdate();
            return true;
        }catch(SQLException e){
            e.printStackTrace();
        }
       return false;
    }
    
    public boolean actualizar(Empleado_Model emp) throws SQLException{
        String sql = "UPDATE empleados SET nombre = ?, apellido = ?, puesto = ?, salario = ?, fecha_ingreso = ? WHERE id = ?";
        
        try(Connection conn = connFactory.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            
            stmt.setString(1, emp.getNombre());
            stmt.setString(2, emp.getApellido());
            stmt.setString(3, emp.getPuesto());
            stmt.setDouble(4, emp.getSalario());
            stmt.setDate(5, emp.getFecha_ingreso());
            stmt.setInt(6, emp.getId());
            
            stmt.executeUpdate();
            return true;
        } catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean eliminar(int id) throws SQLException{
        String sql = "DELETE FROM empleados WHERE  id = ?";
        
        try(Connection conn = connFactory.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            
            stmt.setInt(1, id);
            stmt.executeUpdate();
            return true;
        } catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
}
