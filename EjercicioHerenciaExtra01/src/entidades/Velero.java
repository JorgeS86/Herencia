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
public class Velero extends Barco {

    private Integer nroMastiles;

    public Velero() {
    }

    public Velero(Integer nroMastiles, String matricula, Integer eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.nroMastiles = nroMastiles;
    }

    public Integer getNroMastiles() {
        return nroMastiles;
    }

    public void setNroMastiles(Integer nroMastiles) {
        this.nroMastiles = nroMastiles;
    }

    @Override
    public String toString() {
        return "Velero{" +"matricula=" + matricula + ", eslora=" + eslora + ", anioFabricacion=" + anioFabricacion + "nroMastiles=" + nroMastiles + '}';
    }

    public void crearBarco() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        super.crearBarco();
        System.out.println("Ingrese nro de mástiles");
        nroMastiles = leer.nextInt();
    }

}
