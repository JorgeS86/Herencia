/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author jorge
 */
public class ExtraHotelero extends Alojamiento{
    protected boolean privado;
    protected int mtsCuadrados;

    public ExtraHotelero() {
    }

    public ExtraHotelero(boolean privado, int mtsCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.mtsCuadrados = mtsCuadrados;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public int getMtsCuadrados() {
        return mtsCuadrados;
    }

    public void setMtsCuadrados(int mtsCuadrados) {
        this.mtsCuadrados = mtsCuadrados;
    }

    @Override
    public String toString() {
        return "ExtraHotelero{" + "privado=" + privado + ", mtsCuadrados=" + mtsCuadrados + super.toString()+'}';
    }
    
    
}
