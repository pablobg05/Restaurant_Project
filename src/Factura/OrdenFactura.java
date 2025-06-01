package Factura;

import java.sql.Timestamp;

public class OrdenFactura {
    private int idOrden;
    private int noMesa;
    private int idReceta;
    private String nombreReceta;
    private double precio;
    private int cantidad;
    private Timestamp fechaHora;

    public OrdenFactura(int idOrden, int noMesa, int idReceta, String nombreReceta, double precio, int cantidad, Timestamp fechaHora) {
        this.idOrden = idOrden;
        this.noMesa = noMesa;
        this.idReceta = idReceta;
        this.nombreReceta = nombreReceta;
        this.precio = precio;
        this.cantidad = cantidad;
        this.fechaHora = fechaHora;
    }


    public int getIdOrden() { return idOrden; }
    public int getNoMesa() { return noMesa; }
    public int getIdReceta() { return idReceta; }
    public String getNombreReceta() { return nombreReceta; }
    public double getPrecio() { return precio; }
    public int getCantidad() { return cantidad; }
    public Timestamp getFechaHora() { return fechaHora; }
}