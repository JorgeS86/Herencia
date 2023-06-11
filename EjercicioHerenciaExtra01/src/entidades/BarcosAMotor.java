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
public class BarcosAMotor extends Barco{
    protected Integer potenciaCV;

    public BarcosAMotor() {
    }

    public BarcosAMotor(Integer potenciaCV, String matricula, Integer eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public Integer getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(Integer potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public String toString() {
        return "BarcosAMotor{" + "matricula=" + matricula + ", eslora=" + eslora + ", anioFabricacion=" + anioFabricacion + "potenciaCV=" + potenciaCV + '}';
    }
    
     public void crearBarco() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        super.crearBarco();
        System.out.println("Ingrese la potencia");
        potenciaCV = leer.nextInt();
    }

    @Override
    public int calcularModulo() {
        return super.calcularModulo()+getPotenciaCV(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
     
}
