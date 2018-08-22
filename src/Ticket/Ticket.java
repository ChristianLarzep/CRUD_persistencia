/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ticket;

import Vehiculos.Vehiculo;
import java.io.Serializable;



/**
 *
 * @author christian
 */
public class Ticket implements Serializable{
    
    private static long serialVersionUID = 8799656478674716638L;
    private int idTicket;
    private Vehiculo vehiculo;
    private double total;
    private Cliente cliente;
    private String fecha;
    private String hora;
    private boolean borrado;

    public Ticket(){
        
    }
    
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    public boolean isBorrado() {
        return borrado;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }
    
    @Override
    public String toString(){
        return idTicket+".- "+vehiculo.toString()+
        " \n"+cliente.toString()+" \nFecha: "+fecha+
        " \nHora: "+hora+" \nTotal: "+total+"\n";
    }
    
}
