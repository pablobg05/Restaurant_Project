
package Sucursales;
import Producto.*;
import java.sql.SQLException;
import java.util.List;

public class Sucursal_Controller {
    private final SucursalDAO dao = new SucursalDAO();


    public List<Sucursal_Model> obtenerSucursales() throws SQLException {
        return dao.obtenerTodos();
    }

    public Sucursal_Model getSucursalById(int id) throws SQLException {
        return dao.obtenerUno(id);
    }

    public void ingresarSucursal(String nombre, String direccion, String telefono, String correo, String gerente) throws SQLException {
        Sucursal_Model suc = new Sucursal_Model(nombre, direccion, telefono, correo, gerente);
        dao.guardar(suc);
    }
    
    public void eliminarSucursal(int id) throws SQLException {
        Sucursal_Model suc = new Sucursal_Model(id);
        dao.eliminar(suc);
    }

    public void actualizarInformacion(int id, String nuevoTelefono, String nuevoGerente) {
        Sucursal_Model suc = new Sucursal_Model(id, nuevoTelefono, nuevoGerente);
        dao.actualizar(suc);
    }
}
