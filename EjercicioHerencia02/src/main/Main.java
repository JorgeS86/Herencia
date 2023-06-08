/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import entidades.Electrodomestico;
import entidades.Lavadora;
import entidades.Televisor;
import java.util.ArrayList;

/**
 *
 * @author jorge
 */
public class Main {
    public static void main(String[] args) {
//        Lavadora lav = new Lavadora();
//        lav.crearLavadora();
//        lav.precioFinal();
//        System.out.println(lav);
//        
//        Televisor tv = new Televisor();
//        tv.crearTelevisor();
//        tv.precioFinal();
//        System.out.println(tv);
        
        /*Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.*/
        
        ArrayList<Electrodomestico> listaElectro = new ArrayList();
        
         Lavadora lav1 = new Lavadora(35, 1000d, "BLANCO", 'A', 40);
         listaElectro.add(lav1);
         Lavadora lav2 = new Lavadora(25, 1000d, "GRIS", 'C', 50);
         listaElectro.add(lav2);
         Televisor tv1 = new Televisor(55, true, 1000d, "NEGRO", 'A', 25);
         listaElectro.add(tv1);
         Televisor tv2 = new Televisor(32, false, 1000d, "BLANCO", 'B', 15);
         listaElectro.add(tv2);
         
         System.out.println(listaElectro);
         
         double sumaTV = 0;
         double sumaLav = 0;
         double sumaTotal = 0;
         
         for (Electrodomestico lista : listaElectro) {
            lista.precioFinal();
            sumaTotal += lista.getPrecio();
            if (lista instanceof Televisor) {
                 sumaTV += lista.getPrecio();
             } else if(lista instanceof Lavadora){
                 sumaLav += lista.getPrecio();
             }
        }
         System.out.println(listaElectro);
         System.out.println("Suma TVs: "+sumaTV);
         System.out.println("Suma Lavadoras: "+sumaLav);
         System.out.println("Suma Total: "+sumaTotal);
    }
}
