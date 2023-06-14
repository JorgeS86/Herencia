/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author jorge
 */
public class Camping extends ExtraHotelero{
    private int capMaxCarpas;
    private int cantBañosDisp;
    private boolean Restaurante;

    public Camping() {
    }

    public Camping(int capMaxCarpas, int cantBañosDisp, boolean Restaurante, boolean privado, int mtsCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, mtsCuadrados, nombre, direccion, localidad, gerente);
        this.capMaxCarpas = capMaxCarpas;
        this.cantBañosDisp = cantBañosDisp;
        this.Restaurante = Restaurante;
    }

    public int getCapMaxCarpas() {
        return capMaxCarpas;
    }

    public void setCapMaxCarpas(int capMaxCarpas) {
        this.capMaxCarpas = capMaxCarpas;
    }

    public int getCantBañosDisp() {
        return cantBañosDisp;
    }

    public void setCantBañosDisp(int cantBañosDisp) {
        this.cantBañosDisp = cantBañosDisp;
    }

    public boolean isRestaurante() {
        return Restaurante;
    }

    public void setRestaurante(boolean Restaurante) {
        this.Restaurante = Restaurante;
    }

    @Override
    public String toString() {
        return "Camping{" + "capMaxCarpas=" + capMaxCarpas + ", cantBa\u00f1osDisp=" + cantBañosDisp + ", Restaurante=" + Restaurante + " , "+super.toString()+'}';
    }
    
    
}
