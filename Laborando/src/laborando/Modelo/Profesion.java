/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laborando.Modelo;

public class Profesion {
    private int cod_pro;
    private String descripcion;

    public Profesion() {
    }

    public Profesion(int cod_pro, String descripcion) {
        this.cod_pro = cod_pro;
        this.descripcion = descripcion;
    }

    public int getCod_pro() {
        return cod_pro;
    }

    public void setCod_pro(int cod_pro) {
        this.cod_pro = cod_pro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
}
