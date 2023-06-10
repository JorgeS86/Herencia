/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import Service.AlquilerService;
import entidades.Alquiler;
import java.util.ArrayList;

/**
 *
 * @author jorge
 */
public class Main {

    public static void main(String[] args) {
        AlquilerService AS = new AlquilerService();
        ArrayList<Alquiler> alquileres = new ArrayList();
        Alquiler A1 = AS.crearAlquiler();
        alquileres.add(A1);
        Alquiler A2 = AS.crearAlquiler();
        alquileres.add(A2);
        System.out.println(alquileres);
        
    }
}
