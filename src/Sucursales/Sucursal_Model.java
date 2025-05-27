
package Sucursales;

import Producto.*;
import java.util.Date;


public class Sucursal_Model {
    private int id;
    private String nombre;
    private String direccion;
    private int telefono;
    private String correo;
    private String gerente;
    private Date fechaApertura;
    
    public Sucursal_Model(){
        this.id=0;
        this.nombre= "";
        this.direccion = "";
        this.telefono= 0;
        this.correo = "";
        this.gerente= "";
        this.fechaApertura = null;
    }
    
    public Sucursal_Model(int id, String nombre, String direccion, int telefono, String correo, String gerente, Date fecha){
        this.id=id;
        this.nombre= nombre;
        this.direccion = direccion;
        this.telefono= telefono;
        this.correo = correo;
        this.gerente= gerente;
        this.fechaApertura = fecha;
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }
    
  
}  