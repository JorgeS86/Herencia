/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Edificio;
import entidades.EdificioDeOficinas;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class EdificioDeOficinasService {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public EdificioDeOficinas crearEdifDeOf(){
        EdificioDeOficinas EdiDeOfAux = new EdificioDeOficinas();
        System.out.println("NUEVO EDIFICIO DE OFICINAS");
        System.out.println("Ingrese el nro de oficinas");
        EdiDeOfAux.setNroOficinas(leer.nextInt());
        System.out.println("Ingrese la cantidad de personas por oficina");
        EdiDeOfAux.setCantPersXof(leer.nextInt());
        System.out.println("Ingrese la cantidad de Pisos");
        EdiDeOfAux.setNroDePisos(leer.nextInt());
        System.out.println("MEDIDAS");
        System.out.println("Ingrese Ancho");
        EdiDeOfAux.setAncho(leer.nextDouble());
        System.out.println("Ingrese Alto");
        EdiDeOfAux.setAlto(leer.nextDouble());
        System.out.println("Ingrese Largo");
        EdiDeOfAux.setLargo(leer.nextDouble());
        return EdiDeOfAux;
    }
    
    public int cantPersonas(Edificio listaEdificios){
        EdificioDeOficinas EdiDeOfAux2 = (EdificioDeOficinas)listaEdificios;
        int cantPersonas = (EdiDeOfAux2.getCantPersXof() * EdiDeOfAux2.getNroOficinas()) * EdiDeOfAux2.getNroDePisos();
    return cantPersonas;
    }
}
