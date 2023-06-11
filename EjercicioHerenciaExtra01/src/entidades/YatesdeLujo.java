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
public class YatesdeLujo extends BarcosAMotor {

    private Integer nrodeCamarotes;

    public YatesdeLujo() {
    }

    public YatesdeLujo(Integer nrodeCamarotes, Integer potenciaCV, String matricula, Integer eslora, Integer anioFabricacion) {
        super(potenciaCV, matricula, eslora, anioFabricacion);
        this.nrodeCamarotes = nrodeCamarotes;
    }

    public Integer getNrodeCamarotes() {
        return nrodeCamarotes;
    }

    public void setNrodeCamarotes(Integer nrodeCamarotes) {
        this.nrodeCamarotes = nrodeCamarotes;
    }

    @Override
    public String toString() {
        return "YatesdeLujo{" + "matricula=" + matricula + ", eslora=" + eslora + ", anioFabricacion=" + anioFabricacion + ", potenciaCV=" + potenciaCV + ", nrodeCamarotes=" + nrodeCamarotes + '}';
    }

    public void crearBarco() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        super.crearBarco();
        System.out.println("Ingrese nro de camarotes: ");
        nrodeCamarotes = leer.nextInt();
    }

    @Override
    public int calcularModulo() {
        return super.calcularModulo()+getNrodeCamarotes(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
