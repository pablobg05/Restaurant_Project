
package Producto;
import java.sql.SQLException;
import java.util.List;

public class Producto_Controller {
    private final ProductoDAO dao = new ProductoDAO();
    private final Producto_View view = new Producto_View();
    
    public List<Producto_Model> obtenerProductos() throws SQLException{
        return dao.obtenerTodos();
    }
    
    public void obtener1Producto(int id) throws SQLException{
        Producto_Model prd = new Producto_Model(id);
        Producto_Model producto = dao.obtenerUno(prd);
        view.mostrar(producto);
        
    }
    
    public void ingresarProducto (String marca, String producto, double precio, String descripcion) throws SQLException{
        Producto_Model prd = new Producto_Model(marca, producto, precio, descripcion);
        dao.guardar(prd);
    }
    
    public void actualizarStock (int stock, int id)throws SQLException {
        Producto_Model prd = new Producto_Model (stock, id, 0);
        dao.actualiarStock(prd);
    }
    
    public void actualizarPrecio (int precio, int id)throws SQLException {
        Producto_Model prd = new Producto_Model (precio, id);
        dao.actualizarPrecio(prd);
    }
    
    public void compras (Integer cantidad, int id)throws SQLException{
        Producto_Model prd = new Producto_Model (id);
        dao.compras(prd, cantidad);
    } 
     
    public void elimiarProducto (int id)throws SQLException{
        Producto_Model prd = new Producto_Model (id);
        dao.eliminar(prd);
    }
}
