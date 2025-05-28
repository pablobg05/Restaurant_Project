package InventarioSucursal;

public class InvSuc_Model {
    int id;
    int id_producto;
    int id_sucursal;
    int cantidad;

    public InvSuc_Model(int id_producto, int id_sucursal, int cantidad) {
        this.id_producto = id_producto;
        this.id_sucursal = id_sucursal;
        this.cantidad = cantidad;
    }

    public InvSuc_Model(int id, int cantidad) {
        this.id = id;
        this.cantidad = cantidad;
    }

    public InvSuc_Model(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getId_sucursal() {
        return id_sucursal;
    }

    public void setId_sucursal(int id_sucursal) {
        this.id_sucursal = id_sucursal;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
