/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import entidades.Estudiante;
import entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Persona> listaFacultad = new ArrayList();

        Estudiante E1 = new Estudiante("1A", "JORGE", "SUSAMA", 01, "SOLTERO");
        Estudiante E2 = new Estudiante("2B ", "DANIEL", "GRIMA", 22, "SOLTERO");
        Estudiante E3 = new Estudiante("1B", "PRISCILA", "KREISCHER", 10, "SOLTERO");

        listaFacultad.add(E1);
        listaFacultad.add(E2);
        listaFacultad.add(E3);

        boolean salir = true;
        do {
            System.out.println("-------------");
            System.out.println("MENU");
            System.out.println("FACULTAD");
            System.out.println("-------------");
            System.out.println("OPCIONES");
            System.out.println("1-Cambio del estado civil de una persona");
            System.out.println("2-Reasignación de despacho a un empleado");
            System.out.println("3-Matriculación de un estudiante en un nuevo curso");
            System.out.println("4-Cambio de departamento de un profesor");
            System.out.println("5-Traslado de sección de un empleado del personal de servicio");
            System.out.println("6-Imprimir Info");
            System.out.println("0-SALIR");
            System.out.println("-------------");
            System.out.println("Elija una opción:");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("CAMBIO ESTADO CIVIL");
                    System.out.println("Ingrese la ID de la persona");
                    int id = leer.nextInt();
                    boolean respuesta = false;
                    for (Persona cambioEC : listaFacultad) {
                        if (id == cambioEC.getId()) {
                            System.out.println("El estado civil actual es: " + cambioEC.getEstadoCivil());
                            System.out.println("Ingrese el nuevo estado civil: ");
                            cambioEC.setEstadoCivil(leer.next());
                            break;
                        } else {
                            respuesta = true;
                        }
                    }
                    if (respuesta) {
                        System.out.println("El ID seleccionado no se encontró en la base de datos");
                    }
                    break;
                case 2:

                    break;
                case 3:
                    System.out.println("NUEVA MATRICULACION");
                    System.out.println("Ingrese la ID de la persona");
                    int idM = leer.nextInt();
                    boolean respuestaM = false;

                    for (Persona cambioMatr : listaFacultad) {
                        if (idM == cambioMatr.getId()) {
                            if (cambioMatr instanceof Estudiante) {
                                System.out.println("El Curso actual es: " + ((Estudiante) cambioMatr).getCurso());
                                System.out.println("Ingrese el nuevo Curso: ");
                                ((Estudiante) cambioMatr).setCurso(leer.next());
                                break;
                            }
                        } else {
                            respuestaM = true;
                        }

                    }
                    if (respuestaM) {
                        System.out.println("El ID seleccionado no se encontró en la base de datos");
                    }
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    System.out.println("BASE DE DATOS:");
                    for (Persona mostrarPersona : listaFacultad) {
                        System.out.println(mostrarPersona);
                    }
                    break;

                case 0:
                    System.out.println("USTED SELECCIONO SALIR");
                    salir = false;
                    break;
                default:
                    System.out.println("La opcion elegida no es valida");
            }
        } while (salir);

    }
}
