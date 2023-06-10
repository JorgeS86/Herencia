/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import entidades.Alquiler;
import entidades.BarcosAMotor;
import entidades.Velero;
import entidades.YatesdeLujo;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AlquilerService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Alquiler crearAlquiler() {
        Alquiler alquilerAux = new Alquiler();
        System.out.println("--------------");
        System.out.println("NUEVO ALQUILER");

        System.out.println("Ingrese Nombre");
        alquilerAux.setNombre(leer.next());

        System.out.println("Ingrese Documento");
        alquilerAux.setDocumento(leer.nextInt());

        System.out.println("Fecha de Inicio Alquiler");
        System.out.println("Día (dd)");
        int diaI = leer.nextInt();
        System.out.println("Mes (mm)");
        int mesI = leer.nextInt() - 1;
        System.out.println("Año (aaaa)");
        int anioI = leer.nextInt() + 100;
        Date fechaInicio = new Date(anioI, mesI, diaI);
        alquilerAux.setFechaAlquiler(fechaInicio);

        System.out.println("Fecha de Finalización Alquiler");
        System.out.println("Día (dd)");
        int diaF = leer.nextInt();
        System.out.println("Mes (mm)");
        int mesF = leer.nextInt() - 1;
        System.out.println("Año (aa)");
        int anioF = leer.nextInt() + 100;
        Date fechaFinal = new Date(anioF, mesF, diaF);
        alquilerAux.setFechaDevolucion(fechaFinal);

        System.out.println("Ingrese posicion de amarre");
        alquilerAux.setPosicionAmarre(leer.nextInt());

        System.out.println("Ingrese el tipo de barco");
        System.out.println("1- Velero // 2- Barco a Motor // 3- Yate");
        int tipoBarco = leer.nextInt();
        switch (tipoBarco) {
            case 1:
                Velero velero = new Velero();
                velero.crearBarco();
                alquilerAux.setBarco(velero);
                break;
            case 2:
                BarcosAMotor bam = new BarcosAMotor();
                bam.crearBarco();
                alquilerAux.setBarco(bam);
                break;
            case 3:
                YatesdeLujo ydl = new YatesdeLujo();
                ydl.crearBarco();
                alquilerAux.setBarco(ydl);
                break;
            default:
                System.out.println("La opcion ingresada no es válida");
        }
        return alquilerAux;
    }
    
  /* public Double calculoAlquiler(Alquiler ){
       int diasAlquiler = barco.getFechaDevolucion().getDay()-barco.getFechaAlquiler().getDay();
       int modulo = barco.getBarco();
       Double precioAlquiler = diasAlquiler * (barco.)
       return precioAlquiler;
   }*/
}
