package Empleado;

import conexion.CreateConnection;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
public class EmpleadoDAO {
    private CreateConnection cn = new CreateConnection();
    
    public List<Empleado_Model> obtenerTodos() {
        List<Empleado_Model> lista = new ArrayList<>();
//        String sql = "SELECT * FROM empleados";
        String sql = "SELECT * FROM empleado";
        
        try(Connection conn = cn.getConnection();
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
            System.out.println(e.getMessage());
        }
        return lista;
    }
    
    public Empleado_Model obtenerUno(int id) throws SQLException{
        Empleado_Model emp = new Empleado_Model();
//        String sql = "SELECT * FROM empleados WHERE id = ?";
        String sql = "SELECT * FROM empleado WHERE id = ?";
        
        try(Connection conn = cn.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            
            stmt.setInt(1, id);
                
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()){
                emp.setNombre(rs.getString("nombre"));
                emp.setApellido(rs.getString("apellido"));
                emp.setPuesto(rs.getString("puesto"));
                emp.setSalario(rs.getInt("salario"));
                emp.setFecha_ingreso(rs.getDate("fecha_ingreso"));
                emp.setEstado(rs.getBoolean("estado"));
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return emp;
    }
    
    public boolean guardar(Empleado_Model emp) throws SQLException{
//        String sql = "INSERT INTO empleados(nombre, apellido, puesto, salario, fecha_ingreso) VALUES(?,?,?,?,?)";
        String sql = "INSERT INTO empleado(nombre, apellido, puesto, salario, fecha_ingreso) VALUES(?,?,?,?,?)";
        
        try(Connection conn = cn.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            
            stmt.setString(1, emp.getNombre());
            stmt.setString(2, emp.getApellido());
            stmt.setString(3, emp.getPuesto());
            stmt.setDouble(4, emp.getSalario());
            stmt.setDate(5, emp.getFecha_ingreso());
            
            stmt.executeUpdate();
            return true;
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
       return false;
    }
    
    public boolean actualizar(Empleado_Model emp) throws SQLException{
//        String sql = "UPDATE empleados SET nombre = ?, apellido = ?, puesto = ?, salario = ?, fecha_ingreso = ? WHERE id = ?";
        String sql = "UPDATE empleado SET nombre = ?, apellido = ?, puesto = ?, salario = ?, fecha_ingreso = ?, estado = ? WHERE id = ?";
        
        try(Connection conn = cn.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            
            stmt.setString(1, emp.getNombre());
            stmt.setString(2, emp.getApellido());
            stmt.setString(3, emp.getPuesto());
            stmt.setDouble(4, emp.getSalario());
            stmt.setDate(5, emp.getFecha_ingreso());
            stmt.setBoolean(6, emp.isEstado());
            stmt.setInt(7, emp.getId());
            
            stmt.executeUpdate();
            return true;
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return false;
    }
    
    public boolean eliminar(int id) throws SQLException{
//        String sql = "DELETE FROM empleados WHERE  id = ?";
        String sql = "DELETE FROM empleado WHERE  id = ?";
        
        try(Connection conn = cn.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            
            stmt.setInt(1, id);
            stmt.executeUpdate();
            return true;
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return false;
    }
}


