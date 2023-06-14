/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author jorge
 */
public class Residencia extends ExtraHotelero{
    private int cantHabitaciones;
    private boolean descuentos;
    private boolean campoDep;

    public Residencia() {
    }

    public Residencia(int cantHabitaciones, boolean descuentos, boolean campoDep, boolean privado, int mtsCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, mtsCuadrados, nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.descuentos = descuentos;
        this.campoDep = campoDep;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDescuentos() {
        return descuentos;
    }

    public void setDescuentos(boolean descuentos) {
        this.descuentos = descuentos;
    }

    public boolean isCampoDep() {
        return campoDep;
    }

    public void setCampoDep(boolean campoDep) {
        this.campoDep = campoDep;
    }

    @Override
    public String toString() {
        return "Residencia{" + "cantHabitaciones=" + cantHabitaciones + ", descuentos=" + descuentos + ", campoDep=" + campoDep +" , "+super.toString()+ '}';
    }

    
    
    
}
