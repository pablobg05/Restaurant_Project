
package Producto;


public class Producto_Model {
    private int id;
    private String marca;
    private String producto;
    private double precio;
    private String descripcion;
    private int stock;
    private int compras;
    
    public Producto_Model(){
        this.id=0;
        this.marca = "";
        this.producto = "";
        this.precio = 0.0;
        this.descripcion = "";
        this.stock = 0;
        this.compras = 0;
    }
    
    public Producto_Model(int id, String marca, String producto, double precio, String descripcion, int stock, int compras){
        this.id = id;
        this.marca = marca;
        this.producto = producto;
        this.precio = precio;
        this.descripcion = descripcion;
        this.stock = stock;
        this.compras = compras;
    }
    
    public Producto_Model(String marca, String producto, double precio, String descripcion){
        this.marca = marca;
        this.producto = producto;
        this.precio = precio;
        this.descripcion = descripcion;
    }
    
    public Producto_Model(int id, String descripcion){
        this.id = id;
        this.descripcion = descripcion;
    }
    
    public Producto_Model(int compras, int stock, double precio, String descripcion){
        this.compras = compras;
        this.stock = stock;
        this.precio = precio;
        this.descripcion = descripcion;
    }
    
    public Producto_Model (int id){
        this.id=id;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCompras() {
        return compras;
    }

    public void setCompras(int compras) {
        this.compras = compras;
    }
    
    
}
