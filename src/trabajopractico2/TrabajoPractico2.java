/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author emadupre
 */
public class TrabajoPractico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Trabajo Práctico 2");
        System.out.println("Commit Ema Dupre");
        System.out.println("Participantes: \n\t-Bossa José \n\t-Bongiovanni Naiara \n\t-Bonisoni Claudia \n\t-Achucarro"
                + "Gonzalo \n\t-Fet Enzo \n\t-García Emmanuel");
        double cola = 0;
        double velocidad = 0;
        double propulsion = 0;
        boolean continuar = true;
        System.out.println("---Creando a OrniVerde---");

        while (continuar) {
            try {
                System.out.println("Ingrese la medida de la cola (max/15cm)");
                cola = Double.parseDouble(sc.nextLine());
                if (cola > 15) {
                    System.out.println("Se exedió del máximo.");
                    System.out.println("--------------------------------------\n");
                    continue;
                }
                continuar = false;

                continuar = true;

                while (continuar) {

                    System.out.println("Ingrese la velocidad (max/8km/h)");
                    velocidad = Double.parseDouble(sc.nextLine());
                    if (velocidad > 15) {
                        System.out.println("Se exedió del máximo.");
                        System.out.println("\n--------------------------------------\n");
                        continue;
                    }
                    continuar = false;
                }

                OrniVerde orni1 = new OrniVerde("Naiara", cola, velocidad);
                System.out.println("---OrniVerde Creado--");
                orni1.mostrarInformacion();
                System.out.println("\n--------------------------------------\n");

                System.out.println("---Creando Ornis Azul---"
                        + " \nComenzamos por Blue");
                continuar = true;
                while (continuar) {
                    System.out.println("Ingrese la medida de la cola (max/15cm)");
                    cola = Double.parseDouble(sc.nextLine());
                    if (cola > 15) {
                        System.out.println("Se exedió del máximo.");
                        System.out.println("--------------------------------------\n");
                        continue;
                    }
                    continuar = false;
                }
                continuar = true;
                while (continuar) {
                    System.out.println("Ingrese la velocidad (max/8km/h)");
                    velocidad = Double.parseDouble(sc.nextLine());
                    if (velocidad > 15) {
                        System.out.println("Se exedió del máximo.");
                        System.out.println("\n--------------------------------------\n");
                        continue;
                    }
                    continuar = false;
                }
                continuar = true;
                while (continuar) {
                    System.out.println("Ingrese la propulsión (entre 5/10km)");
                    propulsion = Double.parseDouble(sc.nextLine());
                    if (propulsion > 10 || propulsion < 5) {
                        System.out.println("Fuera del rango.");
                        System.out.println("\n--------------------------------------\n");
                        continue;
                    }
                    continuar = false;
                }

                OrniAzul orni2 = new OrniAzul("Blue", propulsion, cola, velocidad);
                System.out.println("---Orni Blue Creado--");
                orni2.mostrarInformacion();
                System.out.println("\n--------------------------------------\n");

                System.out.println("Seguimos por Blui");

                continuar = true;
                while (continuar) {
                    System.out.println("Ingrese la medida de la cola (max/15cm)");
                    cola = Double.parseDouble(sc.nextLine());
                    if (cola > 15) {
                        System.out.println("Se exedió del máximo.");
                        System.out.println("--------------------------------------\n");
                        continue;
                    }
                    continuar = false;
                }
                continuar = true;
                while (continuar) {
                    System.out.println("Ingrese la velocidad (max/8km/h)");
                    velocidad = Double.parseDouble(sc.nextLine());
                    if (velocidad > 15) {
                        System.out.println("Se exedió del máximo.");
                        System.out.println("\n--------------------------------------\n");
                        continue;
                    }
                    continuar = false;
                }
                continuar = true;
                while (continuar) {
                    System.out.println("Ingrese la propulsión (entre 5/10km)");
                    propulsion = Double.parseDouble(sc.nextLine());
                    if (propulsion > 10 || propulsion < 5) {
                        System.out.println("Fuera del rango.");
                        System.out.println("\n--------------------------------------\n");
                        continue;
                    }
                    continuar = false;
                }

                OrniAzul orni3 = new OrniAzul("Blui", propulsion, cola, velocidad);
                System.out.println("---Orni Blui Creado--");
                orni2.mostrarInformacion();
                System.out.println("\n--------------------------------------\n");
            } catch (NumberFormatException e) {
                System.out.println("Ingreso de dato incorrecto.");
            }
        }
    }

}
