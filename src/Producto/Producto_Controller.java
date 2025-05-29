
package Producto;
import java.sql.SQLException;
import java.util.List;

public class Producto_Controller {
    private final ProductoDAO dao = new ProductoDAO();
    //private final Producto_View view = new Producto_View();
    
    public List<Producto_Model> obtenerProductos() throws SQLException{
        return dao.obtenerTodos();
    }
    
    public Producto_Model getProductoById(int id) throws SQLException{
         return dao.obtenerUno(id);
    }
    
    public void ingresarProducto (String marca, String producto, double precio, String descripcion) throws SQLException{
        Producto_Model prd = new Producto_Model(marca, producto, precio, descripcion);
        dao.guardar(prd);
    }

    public void elimiarProducto (int id)throws SQLException{
        Producto_Model prd = new Producto_Model (id);
        dao.eliminar(prd);
    }
    
  public void actualizarInformacion(int id, int compras, int stock, double precio, String descripcionActual, Producto_Model productoActual) {
    dao.actualizarInformacion(productoActual, compras, stock, precio, descripcionActual);
}
}
