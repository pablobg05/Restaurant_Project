
package Inventario;


public class Inventario_ModelA {
    private int id;
    private String marca;
    private String ingredientes;
    private double precio;
    private String descripcion;
    private int stock;
    private int compras;
    
    public Inventario_ModelA(){
        this.id=0;
        this.marca = "";
        this.ingredientes = "";
        this.precio = 0.0;
        this.descripcion = "";
        this.stock = 0;
        this.compras = 0;
    }
    
    public Inventario_ModelA(int id, String marca, String ingredientes, double precio, String descripcion, int stock, int compras){
        this.id = id;
        this.marca = marca;
        this.ingredientes = ingredientes;
        this.precio = precio;
        this.descripcion = descripcion;
        this.stock = stock;
        this.compras = compras;
    }
    
    public Inventario_ModelA(String marca, String producto, double precio, String descripcion){
        this.marca = marca;
        this.ingredientes = producto;
        this.precio = precio;
        this.descripcion = descripcion;
    }
    
    public Inventario_ModelA(int id, String descripcion){
        this.id = id;
        this.descripcion = descripcion;
    }
    
    public Inventario_ModelA(int compras, int stock, double precio, String descripcion){
        this.compras = compras;
        this.stock = stock;
        this.precio = precio;
        this.descripcion = descripcion;
    }
    
    public Inventario_ModelA (int id){
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

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
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
