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
public class Moto extends Vehiculo{
    private String tipoCadena;
    private String tipoManublio;
    
    public Moto(){
        super();
    }
    
    public Moto(String marca, String modelo, int año, String color, double precio, String tipo,String tipoCadena, String tipoManublio){
        super(marca, modelo, año, color, precio, tipo);
        this.tipoCadena = tipoCadena;
        this.tipoManublio = tipoManublio;
    }
    

    public String getTipoCadena() {
        return tipoCadena;
    }

    public void setTipoCadena(String tipoCadena) {
        this.tipoCadena = tipoCadena;
    }

    public String getTipoManublio() {
        return tipoManublio;
    }

    public void setTipoManublio(String tipoManublio) {
        this.tipoManublio = tipoManublio;
    }
    
    public String toString(){
  
        return super.toString()+ " Tipo cadena: "+ tipoCadena+" Tipo manublio: "+tipoManublio;
    }
}
