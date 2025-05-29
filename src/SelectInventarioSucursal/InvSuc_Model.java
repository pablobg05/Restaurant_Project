package SelectInventarioSucursal;

public class InvSuc_Model {
    int id;
    int producto;
    int sucursal;
    int cantidad;

    public InvSuc_Model(int id, int producto, int sucursal, int cantidad) {
        this.id = id;
        this.producto = producto;
        this.sucursal = sucursal;
        this.cantidad = cantidad;
    }
    
    public InvSuc_Model() {
        this.id = 0;
        this.producto = 0;
        this.sucursal = 0;
        this.cantidad = 0;
    }

    public InvSuc_Model(int producto, int sucursal, int cantidad) {
        this.producto = producto;
        this.sucursal = sucursal;
        this.cantidad = cantidad;
    }
    
    public InvSuc_Model(int producto, int sucursal, String debug) {
        this.producto = producto;
        this.sucursal = sucursal;
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

    public int getProducto() {
        return producto;
    }

    public void setProducto(int producto) {
        this.producto = producto;
    }

    public int getSucursal() {
        return sucursal;
    }

    public void setSucursal(int sucursal) {
        this.sucursal = sucursal;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
