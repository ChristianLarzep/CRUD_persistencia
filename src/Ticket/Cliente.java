/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ticket;

import java.io.Serializable;

/**
 *
 * @author christian
 */
public class Cliente implements Serializable {
    private static long serialVersionUID = 8799656478674716638L;
    private String nombre;
    private String apellido;
    private int tel;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
  
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+nombre+" Apellido: "+apellido+" Edad: "+edad+" Tel: "+tel;
    }

    
}
