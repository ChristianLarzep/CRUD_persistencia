/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import Ticket.Cliente;
import Ticket.Ticket;
import Vehiculos.Camioneta;
import Vehiculos.Carro;
import Vehiculos.Moto;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.io.Serializable;
/**
 *
 * @author christian
 */
public class Acciones implements Serializable, CRUD{
    
    private static long serialVersionUID = 8799656478674716638L;
    private int num;
    private ArrayList<Carro> listaCarros = new ArrayList<Carro>();
    private ArrayList<Camioneta> listaCamionetas = new ArrayList<Camioneta>();
    private ArrayList<Moto> listaMotos = new ArrayList<Moto>();
    private ArrayList<Ticket> listaTickets = new ArrayList<Ticket>();
    private int contCarros = 0;
    private int contCamionetas = 0;
    private int contMotos = 0;
    private int contTickets = 0;
    
     public int optionesMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.- Registrar renta.");
        System.out.println("2.- Mostrar tickets");
        System.out.println("3.- Buscar ticket");
        System.out.println("4.- Modificar ");
        System.out.println("5.- Eliminar ticket");
        System.out.println("6.- Registrar entrega vehiculo");
        System.out.println("7.- Registrar vehiculo");
        System.out.println("0.- Salir");
        System.out.print("Opcion: ");
        num = scanner.nextInt();
        return num;
    }
      
    public void registrarVehiculo(){
        System.out.println("1. Carros");
        System.out.println("2. Camionetas");
        System.out.println("3. Motocicletas");
        System.out.print(" Tipo de vehiculo: ");
        Scanner scanner = new Scanner(System.in);
        int tipo = scanner.nextInt();
        switch(tipo){
            case 1:

                listaCarros.add(new Carro());
                listaCarros.get(contCarros).setId(contCarros);
                listaCarros.get(contCarros).setDisponible(true);
                listaCarros.get(contCarros).setTipoVehiculo("car");
                System.out.print(" Marca: ");
                String marca = scanner.next();
                listaCarros.get(contCarros).setMarca(marca);
                System.out.print(" Modelo: ");
                String modelo = scanner.next();
                listaCarros.get(contCarros).setModelo(modelo);
                System.out.print(" Color: ");
                String color = scanner.next();
                listaCarros.get(contCarros).setColor(color);
                System.out.print(" Precio: ");
                double precio = scanner.nextDouble();
                listaCarros.get(contCarros).setPrecio(precio);
                System.out.print(" Año: ");
                int year = scanner.nextInt();
                listaCarros.get(contCarros).setAño(year);
                System.out.println(" Convertible? \n 1- Si || 2- No");
                listaCarros.get(contCarros).setConverible(false);
                int convertible = scanner.nextInt();
                if(convertible == 1){
                listaCarros.get(contCarros).setConverible(true);

                }
                contCarros++;

            break;
            case 2:
                listaCamionetas.add(new Camioneta());
                listaCamionetas.get(contCamionetas).setId(contCamionetas);
                listaCamionetas.get(contCamionetas).setDisponible(true);
                listaCamionetas.get(contCamionetas).setTipoVehiculo("cam");
                System.out.print(" Marca: ");
                String marcaC = scanner.next();
                listaCamionetas.get(contCamionetas).setMarca(marcaC);
                System.out.print(" Modelo: ");
                String modeloC = scanner.next();
                listaCamionetas.get(contCamionetas).setModelo(modeloC);
                System.out.print(" Color: ");
                String colorC = scanner.next();
                listaCamionetas.get(contCamionetas).setColor(colorC);
                System.out.print(" Precio: ");
                double precioC = scanner.nextDouble();
                listaCamionetas.get(contCamionetas).setPrecio(precioC);
                System.out.print(" Año: ");
                int añoC = scanner.nextInt();
                listaCamionetas.get(contCamionetas).setAño(añoC);
                System.out.print(" Tipo cabina: ");
                String cabina = scanner.next();
                listaCamionetas.get(contCamionetas).setTipoCabina(cabina);
                System.out.print(" Tipo caja: ");
                String caja = scanner.next();
                listaCamionetas.get(contCamionetas).setTipoCaja(caja);
                contCamionetas++;
            break;
            case 3:
                listaMotos.add(new Moto());
                listaMotos.get(contMotos).setId(contMotos);
                listaMotos.get(contMotos).setDisponible(true);
                listaMotos.get(contMotos).setTipoVehiculo("mot");
                System.out.print(" Marca: ");
                String marcaM = scanner.next();
                listaMotos.get(contMotos).setMarca(marcaM);
                System.out.print(" Modelo: ");
                String modeloM = scanner.next();
                listaMotos.get(contMotos).setModelo(modeloM);
                System.out.print(" Color: ");
                String colorM = scanner.next();
                listaMotos.get(contMotos).setColor(colorM);
                System.out.print(" Precio: ");
                double precioM = scanner.nextDouble();
                listaMotos.get(contMotos).setPrecio(precioM);
                System.out.print(" Año: ");
                int añoM = scanner.nextInt();
                listaMotos.get(contMotos).setAño(añoM);
                System.out.print(" Tipo cadena: ");
                String cadena = scanner.next();
                listaMotos.get(contMotos).setTipoCadena(cadena);
                System.out.print(" Tipo de manublio: ");
                String manublio = scanner.nextLine();
                listaMotos.get(contMotos).setTipoManublio(manublio);
                contMotos++;
            break;

            default:
                System.out.println("Opcion incorrecta");
            break;    
                }
    }

    public void registrarEntrega(){
        System.out.print(" Id ticket: ");
        Scanner scanner = new Scanner(System.in);
        int idEnt = scanner.nextInt();
        for (int i = 0; i < listaTickets.size(); i++) {
            if(idEnt == listaTickets.get(i).getIdTicket()){
              
                //listaTickets.get(i).setBorrado(true);
                if(listaTickets.get(i).getVehiculo().getTipoVehiculo().equals("car")){
                    listaCarros.get(listaTickets.get(i).getVehiculo().getId()).setDisponible(true);
                }else if(listaTickets.get(i).getVehiculo().getTipoVehiculo().equals("cam")){
                    listaCamionetas.get(listaTickets.get(i).getVehiculo().getId()).setDisponible(true);  
                }else{
                   listaMotos.get(listaTickets.get(i).getVehiculo().getId()).setDisponible(true);
                }
                break;
            }
        }
    }
      
    @Override
    public void registrar() {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Calendar fecha = new GregorianCalendar();
        String año = Integer.toString(fecha.get(Calendar.YEAR));
        String mes = Integer.toString(fecha.get(Calendar.MONTH));
        String dia = Integer.toString(fecha.get(Calendar.DAY_OF_MONTH));
        String hora = Integer.toString(fecha.get(Calendar.HOUR_OF_DAY));
        String minuto = Integer.toString(fecha.get(Calendar.MINUTE));
        String segundo = Integer.toString(fecha.get(Calendar.SECOND));
        System.out.print(" Nombre'(s) del cliente: ");
        String nombre = scanner.nextLine();
        cliente.setNombre(nombre);
        System.out.print(" Apellidos del cliente: ");
        String apellido = scanner.nextLine();
        cliente.setApellido(apellido);
        System.out.print(" Edad: ");
        int edad = scanner.nextInt();
        cliente.setEdad(edad);
        System.out.print(" Telefono: ");
        int tel = scanner.nextInt();
        cliente.setTel(tel);
        System.out.println("1. Carro");
        System.out.println("2. Camioneta");
        System.out.println("3. Motocicleta");
        System.out.print(" Tipo de vehiculo: ");
        int vehiculo = scanner.nextInt();
        switch(vehiculo){
            case 1:
                System.out.println("------------Carros disponibles----------- ");

                for (Carro carro : listaCarros) {
                    if(carro.isDisponible()){
                        System.out.println(carro.getId()+".-"+carro.toString());

                    }
                }

                System.out.print("\nId carro: ");
                int idCarro = scanner.nextInt();
                if(idCarro > listaCarros.size()){
                    System.out.println("No existe el carro");
                }else if(listaCarros.get(idCarro).isDisponible() == false){
                    System.out.println("Carro no disponible");
                }else{
                    listaTickets.add(new Ticket());
                    listaCarros.get(idCarro).setDisponible(false);
                    listaTickets.get(contTickets).setBorrado(false);
                    listaTickets.get(contTickets).setVehiculo(listaCarros.get(idCarro));
                    listaTickets.get(contTickets).setTotal(listaCarros.get(idCarro).getPrecio());
                    listaTickets.get(contTickets).setCliente(cliente);
                    listaTickets.get(contTickets).setFecha(dia+"/"+mes+"/"+año);
                    listaTickets.get(contTickets).setHora(hora+":"+minuto+":"+segundo);
                    listaTickets.get(contTickets).setIdTicket(contTickets);
                    contTickets++;
                }

            break;
            case 2:
                System.out.println("------------Camionetas disponibles----------- ");
                Scanner idcam = new Scanner(System.in);
                for (Camioneta camioneta : listaCamionetas) {
                    if(camioneta.isDisponible()){
                        System.out.println(camioneta.getId()+".-"+camioneta.toString());

                    }
                }

                System.out.print("\nId camioneta: ");
                int idCam = idcam.nextInt();
                if(idCam > listaCamionetas.size()){
                    System.out.println("No existe la camioneta");
                }else if(listaCamionetas.get(idCam).isDisponible() == false){
                    System.out.println("Camioneta no disponible");
                }else{
                    listaTickets.add(new Ticket());
                    listaCamionetas.get(idCam).setDisponible(false);
                    listaTickets.get(contTickets).setBorrado(false);
                    listaTickets.get(contTickets).setVehiculo(listaCamionetas.get(idCam));
                    listaTickets.get(contTickets).setTotal(listaCamionetas.get(idCam).getPrecio());
                    listaTickets.get(contTickets).setCliente(cliente);
                    listaTickets.get(contTickets).setFecha(dia+"/"+mes+"/"+año);
                    listaTickets.get(contTickets).setHora(hora+":"+minuto+":"+segundo);
                    listaTickets.get(contTickets).setIdTicket(contTickets);
                    contTickets++;
                }

            break;
            case 3:
                System.out.println("------------Motos disponibles----------- ");
                Scanner idmot = new Scanner(System.in);
                for (Moto moto: listaMotos) {
                    if(moto.isDisponible()){
                        System.out.println(moto.getId()+".-"+moto.toString());

                    }
                }

                System.out.print("\nId moto: ");
                int idMot = idmot.nextInt();

                if(idMot > listaMotos.size()){
                    System.out.println("No existe la moto");
                }else if(listaMotos.get(idMot).isDisponible() == false){
                    System.out.println("Moto no disponible");
                }else{
                    listaTickets.add(new Ticket());
                    listaMotos.get(idMot).setDisponible(false);
                    listaTickets.get(contTickets).setBorrado(false);
                    listaTickets.get(contTickets).setVehiculo(listaMotos.get(idMot));
                    listaTickets.get(contTickets).setTotal(listaMotos.get(idMot).getPrecio());
                    listaTickets.get(contTickets).setCliente(cliente);
                    listaTickets.get(contTickets).setFecha(dia+"/"+mes+"/"+año);
                    listaTickets.get(contTickets).setHora(hora+":"+minuto+":"+segundo);
                    listaTickets.get(contTickets).setIdTicket(contTickets);
                    contTickets++;
                }

            break;
            default:
                System.out.println("Opcion incorrecta");
            break;    
        }
    }

    @Override
    public void buscar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Id Ticket");
        int idTicket = scanner.nextInt();
        for (int i = 0; i < listaTickets.size(); i++) {
            if(idTicket == listaTickets.get(i).getIdTicket()){
                System.out.println(listaTickets.get(i).toString());
                break;
            }
        }
    }

    @Override
    public void mostrar() {
        System.out.println("------------------------------------------------------");
        for (Ticket ticket : listaTickets) {
                    if(ticket.isBorrado() == false){
                        System.out.println(ticket.toString());
                        System.out.println("------------------------------------------------------");
                    }
                    
        }
    }

    @Override
    public void borrar() {
        System.out.print(" Id ticket: ");
        Scanner scanner = new Scanner(System.in);
        int idElim = scanner.nextInt();
        for (int i = 0; i < listaTickets.size(); i++) {
            if(idElim == listaTickets.get(i).getIdTicket()){
                System.out.println(listaTickets.get(i).toString()+"\n");
                System.out.println("Seguro quieres eliminar este tickete? \n 1- Si || 2- No");
                int confEl = scanner.nextInt();
                if(confEl == 1){
                   listaTickets.get(i).setBorrado(true);
                }
                break;
            }
        }
    }

    @Override
    public void modificar() {
        System.out.print(" Id ticket: ");
        Scanner scanner = new Scanner(System.in);
        int idT = scanner.nextInt();
        Scanner editar = new Scanner(System.in);
        for (int i = 0; i < listaTickets.size(); i++) {
            if(idT == listaTickets.get(i).getIdTicket()){
                System.out.println(listaTickets.get(i).toString()+"\n");
                System.out.println("1. Nombre cliente");
                System.out.println("2. Edad cliente");
                System.out.print(" Opcion: ");
                int opcEdt = editar.nextInt();
                if(opcEdt == 1){
                    System.out.print("Nombre: ");
                    String newNom = editar.next();
                    listaTickets.get(i).getCliente().setNombre(newNom);
                }else if(opcEdt == 2){
                    System.out.print("Edad: ");
                    int newEdad = editar.nextInt();
                    listaTickets.get(i).getCliente().setEdad(newEdad);
                }else{
                    System.out.println("Opcion invalida");
                }

                break;
            }
        }
    }
}

