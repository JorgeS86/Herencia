/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Edificio;
import entidades.Polideportivo;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class PolideportivoService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Polideportivo crearPolideportivo() {
        Polideportivo polideportivoAux = new Polideportivo();
        System.out.println("NUEVO POLIDEPORTIVO");
        System.out.println("Ingrese nombre");
        polideportivoAux.setNombre(leer.next());
        System.out.println("Es techado? (S/N)");
        if (leer.next().equalsIgnoreCase("S")) {
            polideportivoAux.setTechado(true);
        } else {
            polideportivoAux.setTechado(false);
        }
        System.out.println("MEDIDAS");
        System.out.println("Ingrese Ancho");
        polideportivoAux.setAncho(leer.nextDouble());
        System.out.println("Ingrese Alto");
        polideportivoAux.setAlto(leer.nextDouble());
        System.out.println("Ingrese Largo");
        polideportivoAux.setLargo(leer.nextDouble());
        return polideportivoAux;
    }
}
