package Receta;

public class Receta {
    int id_receta;
    int id_producto;
    double cantidad;
    String categoria;

    public Receta(int id_receta, int id_producto, double cantidad, String categoria) {
        this.id_receta = id_receta;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public Receta(int id_producto, double cantidad, String categoria) {
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public Receta(int id_receta) {
        this.id_receta = id_receta;
    }

    public Receta() {
    }

    public int getId_receta() {
        return id_receta;
    }

    public void setId_receta(int id_receta) {
        this.id_receta = id_receta;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
}
