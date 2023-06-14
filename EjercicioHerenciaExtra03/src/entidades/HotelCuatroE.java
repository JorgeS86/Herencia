/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class HotelCuatroE extends Hotel {

    protected String gimnasio;
    protected String nombreRestaurante;
    protected int capRestaurante;

    public HotelCuatroE() {
    }

    public HotelCuatroE(String gimnasio, String nombreRestaurante, int capRestaurante, int cantHabitaciones, int nroCamas, int cantPisos, double precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, nroCamas, cantPisos, precioHabitaciones, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capRestaurante = capRestaurante;
    }

   

    public String isGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getCapRestaurante() {
        return capRestaurante;
    }

    public void setCapRestaurante(int capRestaurante) {
        this.capRestaurante = capRestaurante;
    }

    @Override
    public String toString() {
        return "HotelCuatroE{" + "gimnasio=" + gimnasio + ", nombreRestaurante=" + nombreRestaurante + ", capRestaurante=" + capRestaurante + super.toString() + '}';
    }

    @Override
    public void calcularPrecio() {
        super.calcularPrecio();
        if (capRestaurante > 0 && capRestaurante <= 30) {
            super.setPrecioHabitaciones(super.getPrecioHabitaciones() + 10);
        } else if (capRestaurante > 30 && capRestaurante <= 50) {
            super.setPrecioHabitaciones(super.getPrecioHabitaciones() + 30);
        } else if (capRestaurante > 50) {
            super.setPrecioHabitaciones(super.getPrecioHabitaciones() + 50);
        }

        if (gimnasio.equalsIgnoreCase("A")) {
            super.setPrecioHabitaciones(super.getPrecioHabitaciones() + 50);
        } else if (gimnasio.equalsIgnoreCase("B")) {
            super.setPrecioHabitaciones(super.getPrecioHabitaciones() + 30);
        }
        //System.out.println("Valor Final 4 Estrellas: "+precioHabitaciones);
    }
}
