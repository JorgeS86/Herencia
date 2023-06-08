/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author jorge
 */
public class Lavadora extends Electrodomestico {

    /*A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes
llamar al constructor de la clase padre.*/
    private Integer carga;

    public Lavadora() {
    }

    public Lavadora(Integer carga, Double precio, String color, char consumoEnergetico, Integer peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    /*Los métodos que se implementara serán:
• Método get y set del atributo carga.*/
    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora[" + "Carga:" + carga + " // Precio: " + precio + " // Color: " + color + " // Consumo Energetico: " + consumoEnergetico + " // Peso: " + peso + ']';
    }

    /*Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.*/

    public void crearLavadora() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("LAVADORA");
        crearElectrodomestico();
        System.out.println("Ingrese la capacidad de carga");
        setCarga(leer.nextInt());
    }
    /*Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.*/

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (carga>30) {
             setPrecio(super.getPrecio()+500);
        }
    }
        
    
}
