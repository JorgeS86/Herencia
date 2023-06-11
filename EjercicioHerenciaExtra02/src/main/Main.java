/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import entidades.Edificio;
import entidades.EdificioDeOficinas;
import entidades.Polideportivo;
import java.util.ArrayList;
import servicios.EdificioDeOficinasService;
import servicios.PolideportivoService;

/**
 *
 * @author jorge
 */
public class Main {

    public static void main(String[] args) {

        PolideportivoService PS = new PolideportivoService();
        EdificioDeOficinasService EDOS = new EdificioDeOficinasService();
        ArrayList<Edificio> edificios = new ArrayList();

        Polideportivo P1 = PS.crearPolideportivo();
        Polideportivo P2 = PS.crearPolideportivo();
        edificios.add(P1);
        edificios.add(P2);

        EdificioDeOficinas EDO1 = EDOS.crearEdifDeOf();
        EdificioDeOficinas EDO2 = EDOS.crearEdifDeOf();
        edificios.add(EDO1);
        edificios.add(EDO2);

        int cantTechados = 0;
        
        for (Edificio listaEdificios : edificios) {
            System.out.println(listaEdificios);
            System.out.println("Superficie: " + listaEdificios.calcularSuperficie());
            System.out.println("Volumen: " + listaEdificios.calcularVolumen());
            
            if (listaEdificios instanceof EdificioDeOficinas ) {
                System.out.println("Total de personas Max en el edificio: "+EDOS.cantPersonas(listaEdificios));
            }else{
               Polideportivo PAUX = (Polideportivo) listaEdificios;
                if (PAUX.getTechado()) {
                    cantTechados++;
                }
            }
        }
        System.out.println("La cantidad de Polideportivos techados es: "+cantTechados);
    }
}
