/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.HotelCincoE;
import entidades.HotelCuatroE;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class HotelCincoEstrellasServicio extends HotelCuatroEstrellasServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    
    public HotelCincoE crearHCincoE() {
        HotelCincoE H5EA = new HotelCincoE();
        System.out.println("Hotel 5 Estrellas");
        
        System.out.println("Nombre:");
        H5EA.setNombre(leer.next());
        System.out.println("Direccion:");
        H5EA.setDireccion(leer.next());
        System.out.println("Localidad:");
        H5EA.setLocalidad(leer.next());
        System.out.println("Nombre del Gerente:");
        H5EA.setGerente(leer.next());

        System.out.println("Cantidad de Habitaciones:");
        H5EA.setCantHabitaciones(leer.nextInt());
        System.out.println("Numero de camas:");
        H5EA.setNroCamas(leer.nextInt());
        System.out.println("Cantidad de pisos:");
        H5EA.setCantPisos(leer.nextInt());

        System.out.println("Tiene gimnasio? (A/B)");
        H5EA.setGimnasio(leer.next());
        System.out.println("Ingrese el nombre del Restaurante:");
        H5EA.setNombreRestaurante(leer.next());
        System.out.println("Ingrese la capacidad del Restaurante");
        H5EA.setCapRestaurante(leer.nextInt());
        

        System.out.println("Ingrese la cantitad de Salones de Conferencias:");
        H5EA.setCantSalonesConf(leer.nextInt());
        System.out.println("Ingrese la cantidad de Suites:");
        H5EA.setCantSuites(leer.nextInt());
        System.out.println("Ingrese la cantidad de Limosinas:");
        H5EA.setCantLimosinas(leer.nextInt());
        return H5EA;
    }
}
