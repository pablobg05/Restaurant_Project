package Empleado;

import java.sql.SQLException;
import java.util.List;
public class Empleado_Controller {
    private final EmpleadoDAO dao = new EmpleadoDAO();
    
    public List<Empleado_Model> obtenerEmpleados(){
        return dao.obtenerTodos();
    }
    
    public Empleado_Model obtenerEmpleado(int id) throws SQLException{
        return dao.obtenerUno(id);
    }
    
    public void agregarEmpleado(String nombre, String apellido, String puesto, Double salario, java.sql.Date fecha_ingreso) throws SQLException{
        Empleado_Model emp = new Empleado_Model(nombre, apellido, puesto, salario, fecha_ingreso);
        dao.guardar(emp);
    }
    
    public void actualizarEmpleado(int id, String nombre, String apellido, String puesto, Double salario, java.sql.Date fecha_ingreso, boolean estado) throws SQLException{
        Empleado_Model emp = new Empleado_Model(id, nombre, apellido, puesto, salario, fecha_ingreso, estado);
        dao.actualizar(emp);
    }
    
    public void eliminarEmpleadol(int id) throws SQLException{
        dao.eliminar(id);
    }
}
