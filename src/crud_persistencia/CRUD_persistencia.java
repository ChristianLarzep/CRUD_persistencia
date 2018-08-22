/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_persistencia;

import CRUD.Acciones;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author christian
 */
public class CRUD_persistencia {
    
    private static int num;


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        
        try{
            FileInputStream file = new FileInputStream("registros.txt");
            Acciones acciones = new Acciones();
        
            ObjectInputStream p = new ObjectInputStream(file);
            acciones = (Acciones) p.readObject();
            menu(acciones);
        }catch(FileNotFoundException ex){
           Acciones acciones = new Acciones(); 
           menu(acciones);
        }
    }
    
    public static void menu(Acciones acciones) throws  FileNotFoundException, IOException, ClassNotFoundException{
        int opcion;
        do{
            System.out.print("Opciones: ");
            opcion = acciones.optionesMenu();
            switch(opcion){
                case 0:
                    System.out.println("Bye");
                    FileOutputStream file = new FileOutputStream("registros.txt",false);
                    ObjectOutputStream oos = new ObjectOutputStream(file);
                    oos.writeObject(acciones);
                    oos.close();
                    break;
                case 1:
                    acciones.registrar();
                    break;
                case 2:
                    acciones.mostrar();
                    break;
                case 3:
                    acciones.buscar();
                    break;
                case 4:
                    acciones.modificar();
                    break;
                case 5:
                    acciones.borrar();
                    break;
                case 6:
                    acciones.registrarEntrega();
                    break;
                case 7:
                    acciones.registrarVehiculo();
                    break;
            }
        }while(opcion != 0);
    }
    
}
