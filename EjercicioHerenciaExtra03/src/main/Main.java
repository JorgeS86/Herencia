/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import entidades.Alojamiento;
import entidades.Camping;
import entidades.Hotel;
import entidades.HotelCincoE;
import entidades.HotelCuatroE;
import entidades.Residencia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import servicios.HotelCincoEstrellasServicio;
import servicios.HotelCuatroEstrellasServicio;

/**
 *
 * @author jorge
 */
public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        HotelCuatroEstrellasServicio H4ES = new HotelCuatroEstrellasServicio();
        HotelCincoEstrellasServicio H5ES = new HotelCincoEstrellasServicio();
        ArrayList<Alojamiento> listaAlojamientos = new ArrayList();

        HotelCincoE H5E1 = new HotelCincoE(1, 3, 2,
                "A", "DANY RESTO", 20, 5, 2,
                3, 0, "HOTEL DANY", "CALLE DANY", "MISIONES", "DANY B");

        HotelCincoE H5E2 = new HotelCincoE(2, 1, 1,
                "B", "JUAN RESTO", 60, 3, 3,
                3, 0, "HOTEL JUAN", "CALLE JUAN", "LOMAS DE ZAMORA", "JUAN P");

        HotelCuatroE H4E1 = new HotelCuatroE("A", "JORGE RESTO", 80, 5, 3,
                8, 0, "HOTEL JORGE", "CALLE JORGE", "SAN MARTIN", "JORGE S");

        Camping C1 = new Camping(100, 10, true, false, 100, "Municipal", "GRAL SAN MARTIN", "SAN MARTIN", "JORGE S");
        Camping C2 = new Camping(50, 5, false, true, 50, "TIRO FEDERAL", "AVIACION", "HURLINGHAM", "ALBERTO");
        Camping C3 = new Camping(50, 5, true, true, 50, "TIRO FEDERAL", "SALTA", "SALTA", "HERNAN");

        Residencia R1 = new Residencia(20, true, true, false, 80, "LAS HERAS", "CALLE PRISCILA", "MISIONES", "PRISCILA K");
        Residencia R2 = new Residencia(30, false, false, true, 150, "PARQUE", "CALLE ISAIAS", "MATANZA", "ISAIAS V");
        Residencia R3 = new Residencia(30, true, false, true, 150, "PARQUE II", "CALLE TINCHO", "CORDOBA", "TINCHO B");

        listaAlojamientos.add(H5E1);
        listaAlojamientos.add(H5E2);
        listaAlojamientos.add(H4E1);
        listaAlojamientos.add(C1);
        listaAlojamientos.add(C2);
        listaAlojamientos.add(R1);
        listaAlojamientos.add(R2);
        listaAlojamientos.add(C3);
        listaAlojamientos.add(R3);
        
        for (Alojamiento listaAlojamiento : listaAlojamientos) {
            if (listaAlojamiento instanceof Hotel) {
                if (listaAlojamiento instanceof HotelCincoE) {
                    ((HotelCincoE) listaAlojamiento).calcularPrecio();
                } else if (listaAlojamiento instanceof HotelCuatroE) {
                    ((HotelCuatroE) listaAlojamiento).calcularPrecio();
                }
            }
        }
        boolean salir = true;
        do {
            System.out.println("-------------");
            System.out.println("MENU");
            System.out.println("ALOJAMIENTOS");
            System.out.println("-------------");
            System.out.println("OPCIONES");
            System.out.println("1-MOSTRAR TODOS LOS ALOJAMIENTOS");
            System.out.println("2-MOSTRAR HOTELES POR PRECIO MÁS CARO AL MÁS BARATO");
            System.out.println("3-MOSTRAR TODOS LOS CAMPINGS CON RESTAURANTE");
            System.out.println("4-MOSTRAR TODAS LAS RESIDENCIAS CON DESCUENTO");
            System.out.println("0-SALIR");
            System.out.println("-------------");
            System.out.println("Elija una opción:");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    for (Alojamiento mostrarAlojamientos : listaAlojamientos) {
                        System.out.println(mostrarAlojamientos);
                    }
                    break;
                case 2:
                    ArrayList<Hotel> listaHoteles = new ArrayList();
                    for (Alojamiento listaAlojamiento : listaAlojamientos) {
                        if (listaAlojamiento instanceof Hotel) {
                            listaHoteles.add((Hotel) listaAlojamiento);
                        }
                    }
                    Collections.sort(listaHoteles, new Comparator<Hotel>() {
                        public int compare(Hotel h1, Hotel h2) {
                            return Double.compare(h2.getPrecioHabitaciones(), h1.getPrecioHabitaciones());
                        }
                    });

                    for (Alojamiento mostrarHoteles : listaHoteles) {
                        System.out.println(mostrarHoteles);
                    }
                    break;
                case 3:
                    for (Alojamiento mostrarCampingR : listaAlojamientos) {
                        if (mostrarCampingR instanceof Camping) {
                            if (((Camping) mostrarCampingR).isRestaurante()) {
                                System.out.println(mostrarCampingR);
                            }
                        }
                    }
                    break;
                case 4:
                    for (Alojamiento mostrarResidenciaD : listaAlojamientos) {
                        if (mostrarResidenciaD instanceof Residencia) {
                            if (((Residencia) mostrarResidenciaD).isDescuentos()) {
                                System.out.println(mostrarResidenciaD);
                            }
                        }
                    }
                    break;

                case 0:
                    System.out.println("USTED SELECCIONO SALIR");
                    salir = false;
                    break;
                default:
                    System.out.println("La opcion elegida no es valida");
            }
        } while (salir);

    }
}
