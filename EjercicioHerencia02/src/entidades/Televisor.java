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
public class Televisor extends Electrodomestico {
    /*Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.*/
    
    private Integer resolucion;
    private boolean sintonizadorTDT;
    
    /*Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.*/

    public Televisor() {
    }

    public Televisor(Integer resolucion, boolean sintonizadorTDT, Double precio, String color, char consumoEnergetico, Integer peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    /*Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.*/

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public String toString() {
        return "Televisor[" + "Resolucion: " + resolucion + " // Sintonizador TDT: " + sintonizadorTDT + " // Precio: " + precio + " // Color: " + color + " // Consumo Energetico: " + consumoEnergetico + " // Peso: " + peso + ']';
    }
    
    /*Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.*/
    
    public void crearTelevisor(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("TELEVISOR");
        crearElectrodomestico();
        System.out.println("Ingrese la resolución en pulgadas");
        setResolucion(leer.nextInt());
        System.out.println("Incluye TDT? (S/N)");
        if (leer.next().equalsIgnoreCase("S")) {
            setSintonizadorTDT(true);
        }else{
           setSintonizadorTDT(false); 
        }
    }
    /*Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.*/
    
    @Override
    public void precioFinal(){
        super.precioFinal();
        if (resolucion >= 40) {
            setPrecio(getPrecio()*1.3); 
        }
        
        if(sintonizadorTDT){
            setPrecio(getPrecio()+500);
        }
    }
}
