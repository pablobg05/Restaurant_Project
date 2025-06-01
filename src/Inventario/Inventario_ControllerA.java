
package Inventario;

import java.sql.SQLException;
import java.util.List;

public class Inventario_ControllerA {
    private final InventarioDAOA dao = new InventarioDAOA();
    //private final Producto_View view = new Producto_View();
    
    public List<Inventario_ModelA> obtenerIngredientes() throws SQLException{
        return dao.obtenerTodos();
    }
    
    public Inventario_ModelA getProductoById(int id) throws SQLException{
         return dao.obtenerUno(id);
    }
    
    public void ingresarProducto (String marca, String producto, double precio, String descripcion) throws SQLException{
        Inventario_ModelA prd = new Inventario_ModelA(marca, producto, precio, descripcion);
        dao.guardar(prd);
    }

    public void elimiarProducto (int id)throws SQLException{
        Inventario_ModelA prd = new Inventario_ModelA (id);
        dao.eliminar(prd);
    }
    
    public void actualizarInformacion(int id, int compras, int stock, double precio, String descripcionActual, Inventario_ModelA productoActual) {
      dao.actualizarInformacion(productoActual, compras, stock, precio, descripcionActual);
    }
    
    public void sumarStock(int id, int cantidadASumar) {
        Inventario_ModelA prod = new Inventario_ModelA();
        prod.setId(id);
        dao.actualizarSTOCK(prod, cantidadASumar);
    }
    
    public void reemplazarStock(int id, int nuevoStock, double precio, String descripcion) {
        int compras = 0;
        dao.reemplazarSTOCK(id, nuevoStock, precio, descripcion, compras);
    }
}
