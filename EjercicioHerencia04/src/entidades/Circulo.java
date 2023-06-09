/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author jorge
 */
public class Circulo implements CalculosFormas {

    private Double radio;

    public Circulo() {
    }

    public Circulo(Double radio) {
        this.radio = radio;
    }

    @Override
    public Double calcularArea() {
        Double area = valorPi*Math.pow(radio, 2);
        return area;
    }

    @Override
    public Double calcularPerimetro() {
        Double perimetro = valorPi * (radio*2);
        return perimetro;
    }

}
