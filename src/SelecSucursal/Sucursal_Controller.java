
package SelecSucursal;
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
}
