
package SelecSucursal;

import java.util.Date;


public class Sucursal_Model {
    private int id;
    private String nombre;
    private String direccion;
    private String telefono;
    private String correo;
    private int gerente;
    private Date fechaApertura;
    
    public Sucursal_Model(){
        this.id=0;
        this.nombre= "";
        this.direccion = "";
        this.telefono= "";
        this.correo = "";
        this.gerente= 0;
        this.fechaApertura = null;
    }
    
    public Sucursal_Model( String nombre, String direccion, String telefono, String correo, int gerente){
        this.nombre= nombre;
        this.direccion = direccion;
        this.telefono= telefono;
        this.correo = correo;
        this.gerente= gerente;
    }
    
    public Sucursal_Model(int id, String nombre, String direccion, String telefono, String correo, int gerente, Date fecha){
        this.id = id;
        this.nombre= nombre;
        this.direccion = direccion;
        this.telefono= telefono;
        this.correo = correo;
        this.gerente= gerente;
        this.fechaApertura = fecha;
    }
    
    public Sucursal_Model (int id, String telefono, int gerente){
        this.id = id;
        this.telefono = telefono;
        this.gerente= gerente;
    }
    
    public Sucursal_Model (int id){
        this.id= id;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }



    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getGerente() {
        return gerente;
    }

    public void setGerente(int gerente) {
        this.gerente = gerente;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }
    
  
}  
