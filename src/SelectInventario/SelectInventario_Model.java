
package SelectInventario;

import Inventario.*;


public class SelectInventario_Model {
    private int id;
    private String marca;
    private String ingredientes;
    private double precio;
    private String descripcion;

    
    public SelectInventario_Model(){
        this.id=0;
        this.marca = "";
        this.ingredientes = "";
        this.precio = 0.0;
        this.descripcion = "";

    }
    
    public SelectInventario_Model(int id, String marca, String ingredientes, double precio, String descripcion){
        this.id = id;
        this.marca = marca;
        this.ingredientes = ingredientes;
        this.precio = precio;
        this.descripcion = descripcion;


    }
    
    public SelectInventario_Model(String marca, String producto, double precio, String descripcion){
        this.marca = marca;
        this.ingredientes = producto;
        this.precio = precio;
        this.descripcion = descripcion;
    }
    
    public SelectInventario_Model(int id, String descripcion){
        this.id = id;
        this.descripcion = descripcion;
    }
    
    public SelectInventario_Model(double precio, String descripcion){

        this.precio = precio;
        this.descripcion = descripcion;
    }
    
    public SelectInventario_Model (int id){
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

    


 
    
}
