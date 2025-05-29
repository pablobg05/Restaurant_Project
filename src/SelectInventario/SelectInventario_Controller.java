
package SelectInventario;

import Inventario.*;
import java.sql.SQLException;
import java.util.List;

public class SelectInventario_Controller {
    private final SelectInventarioDAO dao = new SelectInventarioDAO();
    //private final Producto_View view = new Producto_View();
    
    public List<SelectInventario_Model> obtenerIngredientes() throws SQLException{
        return dao.obtenerTodos();
    }
    
    public SelectInventario_Model getProductoById(int id) throws SQLException{
         return dao.obtenerUno(id);
    }
  }