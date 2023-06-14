/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author jorge
 */
public class HotelCincoE extends HotelCuatroE{
    private int cantSalonesConf;
    private int cantSuites;
    private int cantLimosinas;

    public HotelCincoE() {
    }

    public HotelCincoE(int cantSalonesConf, int cantSuites, int cantLimosinas, String gimnasio, String nombreRestaurante, int capRestaurante, int cantHabitaciones, int nroCamas, int cantPisos, double precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(gimnasio, nombreRestaurante, capRestaurante, cantHabitaciones, nroCamas, cantPisos, precioHabitaciones, nombre, direccion, localidad, gerente);
        this.cantSalonesConf = cantSalonesConf;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }


    public int getCantSalonesConf() {
        return cantSalonesConf;
    }

    public void setCantSalonesConf(int cantSalonesConf) {
        this.cantSalonesConf = cantSalonesConf;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(int cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }

    @Override
    public String toString() {
        return "HotelCincoE{" + "cantSalonesConf=" + cantSalonesConf + ", cantSuites=" + cantSuites + ", cantLimosinas=" + cantLimosinas + super.toString()+ '}';
    }

    @Override
    public void calcularPrecio() {
        super.calcularPrecio();
        super.setPrecioHabitaciones(super.getPrecioHabitaciones() + (cantLimosinas * 15));
        //System.out.println("Valor Final 5 estrellas: "+precioHabitaciones);
    }
    
    
}
