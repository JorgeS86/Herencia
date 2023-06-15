/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author jorge
 */
public class Empleado extends Persona{
    protected int anioIncorp;
    protected int nroDespacho;

    public Empleado() {
    }

    public Empleado(int anioIncorp, int nroDespacho, String nombre, String apellido, int id, String estadoCivil) {
        super(nombre, apellido, id, estadoCivil);
        this.anioIncorp = anioIncorp;
        this.nroDespacho = nroDespacho;
    }

    public int getAnioIncorp() {
        return anioIncorp;
    }

    public void setAnioIncorp(int anioIncorp) {
        this.anioIncorp = anioIncorp;
    }

    public int getNroDespacho() {
        return nroDespacho;
    }

    public void setNroDespacho(int nroDespacho) {
        this.nroDespacho = nroDespacho;
    }

    @Override
    public String toString() {
        return "Empleado{"+super.toString()+" , " + "anioIncorp=" + anioIncorp + ", nroDespacho=" + nroDespacho + '}';
    }


}
