/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

import java.io.Serializable;

/**
 *
 * @author christian
 */
public abstract class Vehiculo implements Serializable{
    
    private static long serialVersionUID = 8799656478674716638L;
    private String marca;
    private String modelo;
    private int año;
    private String color;
    private double precio;
    private boolean disponible;
    private int id;
    private String tipoVehiculo;
    
    public Vehiculo(){
        
    }
    
    public Vehiculo(String marca, String modelo, int año, String color, double precio, String tipoVhiculo){
    this.marca = marca;
    this.modelo = modelo;
    this.año = año;
    this.color = color;
    this.precio = precio;
    this.tipoVehiculo = tipoVehiculo;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString(){
        return "Tipo: "+tipoVehiculo+ " Marca: "+getMarca()+" Modelo: "+" Año: "+getAño()+" Color: "+getColor()+" Precio: "+getPrecio();
    }
}
