/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.HotelCuatroE;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class HotelCuatroEstrellasServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public HotelCuatroE crearHCuatroE() {
        HotelCuatroE H4EA = new HotelCuatroE();
        System.out.println("Hotel 4 Estrellas");
        
        System.out.println("Nombre:");
        H4EA.setNombre(leer.next());
        System.out.println("Direccion:");
        H4EA.setDireccion(leer.next());
        System.out.println("Localidad:");
        H4EA.setLocalidad(leer.next());
        System.out.println("Nombre del Gerente:");
        H4EA.setGerente(leer.next());
        

        System.out.println("Cantidad de Habitaciones:");
        H4EA.setCantHabitaciones(leer.nextInt());
        System.out.println("Numero de camas:");
        H4EA.setNroCamas(leer.nextInt());
        System.out.println("Cantidad de pisos:");
        H4EA.setCantPisos(leer.nextInt());

        System.out.println("Tiene gimnasio? (A/B)");
        H4EA.setGimnasio(leer.next());
        System.out.println("Ingrese el nombre del Restaurante:");
        H4EA.setNombreRestaurante(leer.next());
        System.out.println("Ingrese la capacidad del Restaurante");
        H4EA.setCapRestaurante(leer.nextInt());
        
        return H4EA;
    }
}
