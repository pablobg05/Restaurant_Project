
package Inventario;



import java.sql.SQLException;
import java.util.List;

public class Inventario_Controller {
    private final InventarioDAO dao = new InventarioDAO();
    //private final Producto_View view = new Producto_View();
    
    public List<Inventario_Model> obtenerIngredientes() throws SQLException{
        return dao.obtenerTodos();
    }
    
    public Inventario_Model getProductoById(int id) throws SQLException{
         return dao.obtenerUno(id);
    }
    
    public void ingresarProducto (String marca, String producto, double precio, String descripcion) throws SQLException{
        Inventario_Model prd = new Inventario_Model(marca, producto, precio, descripcion);
        dao.guardar(prd);
    }

    public void elimiarProducto (int id)throws SQLException{
        Inventario_Model prd = new Inventario_Model (id);
        dao.eliminar(prd);
    }
    
    public void actualizarInformacion(int id, int compras, /*int stock,*/ double precio, String descripcionActual, Inventario_Model productoActual) {
      dao.actualizarInformacion(productoActual, compras, /*stock,*/ precio, descripcionActual);
    }
    
//    public void sumarStock(int id, int cantidadASumar) {
//        Inventario_Model prod = new Inventario_Model();
//        prod.setId(id);
//        dao.actualizarSTOCK(prod, cantidadASumar);
//    }
    
    public void reemplazarStock(int id, /*int nuevoStock,*/ double precio, String descripcion) {
        int compras = 0;
        dao.reemplazarSTOCK(id, /*nuevoStock,*/ precio, descripcion, compras);
    }
}
