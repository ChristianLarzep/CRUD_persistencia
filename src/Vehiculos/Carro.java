/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

/**
 *
 * @author christian
 */
public class Carro extends Vehiculo{
    private boolean converible;
    
    public Carro(){
        super();
    }

    public boolean isConverible() {
        return converible;
    }

    public void setConverible(boolean converible) {
        this.converible = converible;
    }
    
    public String toString(){
        String convert = "No";
        if(converible){
            convert = "Si";
        }
        return super.toString()+ " Convertible: "+ convert;
    }
    
}
