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
public class Camioneta extends Vehiculo{
    private String tipoCabina;
    private String tipoCaja;
    
    public Camioneta(){
        super();
    }
    
    public String getTipoCabina() {
        return tipoCabina;
    }

    public void setTipoCabina(String tipoCabina) {
        this.tipoCabina = tipoCabina;
    }

    public String getTipoCaja() {
        return tipoCaja;
    }

    public void setTipoCaja(String tipoCaja) {
        this.tipoCaja = tipoCaja;
    }
    public String toString(){

        return super.toString()+ " Tipo cabina: "+ tipoCabina+" Tipo caja: "+tipoCaja;
    }
}
