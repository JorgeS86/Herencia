/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import entidades.Circulo;
import entidades.Rectangulo;

/**
 *
 * @author jorge
 */
public class Main {
    public static void main(String[] args) {
        
        Circulo C1 = new Circulo(10d);
        Circulo C2 = new Circulo(20d);
        
        System.out.println("-----------------");
        System.out.println("AREA CIRCULO 1: "+C1.calcularArea());
        System.out.println("PERIMETRO CIRCULO 1: "+C1.calcularPerimetro());
        System.out.println("-----------------");
        System.out.println("AREA CIRCULO 2: "+C2.calcularArea());
        System.out.println("PERIMETRO CIRCULO 2: "+C2.calcularPerimetro());
        
        Rectangulo R1 = new Rectangulo(2d, 10d);
        Rectangulo R2 = new Rectangulo(5d, 100d);
        
        System.out.println("-----------------");
        System.out.println("AREA RECTANGULO 1: "+R1.calcularArea());
        System.out.println("PERIMETRO RECTANGULO 1: "+R1.calcularPerimetro());
        System.out.println("-----------------");
        System.out.println("AREA RECTANGULO 2: "+R2.calcularArea());
        System.out.println("PERIMETRO RECTANGULO 2: "+R2.calcularPerimetro());
        
    }
   
}
