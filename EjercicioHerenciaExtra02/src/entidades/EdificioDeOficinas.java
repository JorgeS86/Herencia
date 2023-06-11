/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author jorge
 */
public class EdificioDeOficinas extends Edificio {

    private Integer nroOficinas;
    private Integer cantPersXof;
    private Integer nroDePisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(Integer nroOficinas, Integer cantPersXof, Integer nroDePisos, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.nroOficinas = nroOficinas;
        this.cantPersXof = cantPersXof;
        this.nroDePisos = nroDePisos;
    }

    public Integer getNroOficinas() {
        return nroOficinas;
    }

    public void setNroOficinas(Integer nroOficinas) {
        this.nroOficinas = nroOficinas;
    }

    public Integer getCantPersXof() {
        return cantPersXof;
    }

    public void setCantPersXof(Integer cantPersXof) {
        this.cantPersXof = cantPersXof;
    }

    public Integer getNroDePisos() {
        return nroDePisos;
    }

    public void setNroDePisos(Integer nroDePisos) {
        this.nroDePisos = nroDePisos;
    }

    @Override
    public String toString() {
        return "EdificioDeOficinas{" + "nroOficinas=" + nroOficinas + ", cantPersXof=" + cantPersXof + ", nroDePisos=" + nroDePisos + " , "+super.toString()+ '}';
    }
    
    
    @Override
    public Double calcularSuperficie() {
        Double superficie = ancho * largo;
        return superficie;
    }

    @Override
    public Double calcularVolumen() {
         Double volumen = ancho * largo * alto;
        return volumen;
    }
    
}
