/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laborando.Modelo;

import java.util.Date;

public class Cliente {
    private String rut;
    private String nombre;
    private Date fecnac;
    private boolean cv;
    private Profesion profesion;

    public Cliente() {
    }

    public Cliente(String rut, String nombre, Date fecnac, boolean cv, Profesion profesion) {
        this.rut = rut;
        this.nombre = nombre;
        this.fecnac = fecnac;
        this.cv = cv;
        this.profesion = profesion;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecnac() {
        return fecnac;
    }

    public void setFecnac(Date fecnac) {
        this.fecnac = fecnac;
    }

    public boolean isCv() {
        return cv;
    }

    public void setCv(boolean cv) {
        this.cv = cv;
    }

    public Profesion getProfesion() {
        return profesion;
    }

    public void setProfesion(Profesion profesion) {
        this.profesion = profesion;
    }

}

