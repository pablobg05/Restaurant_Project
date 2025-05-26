/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleado;

import java.util.Date;
public class Empleado_Model {
    private int id;
    private String nombre;
    private String apellido;
    private String puesto;
    private double salario;
    private java.sql.Date fecha_ingreso;
    private boolean estado;
    
    public Empleado_Model(){
        this.id = 0;
        this.nombre = "";
        this.apellido = "";
        this.puesto = "";
        this.salario = 0;
        this.fecha_ingreso = null;
        this.estado = true;
    }
    
    public Empleado_Model(int id, String nombre, String apellido, String puesto, double salario, java.sql.Date fecha_ingreso, boolean estado){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.puesto = puesto;
        this.salario = salario;
        this.fecha_ingreso = fecha_ingreso;
        this.estado = estado;
    }
    
    public Empleado_Model(String nombre, String apellido, String puesto, double salario, java.sql.Date fecha_ingreso){
        this.nombre = nombre;
        this.apellido = apellido;
        this.puesto = puesto;
        this.salario = salario;
        this.fecha_ingreso = fecha_ingreso;
    }
    
    public Empleado_Model(String nombre, String apellido, String puesto, double salario, java.sql.Date fecha_ingreso, boolean estado){
        this.nombre = nombre;
        this.apellido = apellido;
        this.puesto = puesto;
        this.salario = salario;
        this.fecha_ingreso = fecha_ingreso;
        this.estado = estado;
    }

    public Empleado_Model(int id) {
        this.id = id;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public java.sql.Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(java.sql.Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}
