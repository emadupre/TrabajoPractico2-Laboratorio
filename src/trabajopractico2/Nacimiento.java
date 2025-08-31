/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopractico2;

import java.util.Scanner;

/**
 *
 * @author Claudia Bonisoni
 */
public class Nacimiento {

    public static OrniVerde creadorDeOrniVerde(String nombre) {
        Scanner sc = new Scanner(System.in);
        double cola = 0;
        double velocidad = 0;
        boolean cont = false;
        System.out.println("---Creando a OrniVerde " + nombre + "---");
        do {
            try {
                System.out.println("Ingrese la medida de la cola (max/15cm)");
                cola = Double.parseDouble(sc.nextLine());
                if (cola <= 15) {
                    cont = true;
                } else {
                    System.out.println("Se exedió del máximo.");
                    System.out.println("--------------------------------------\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("Dato incorrecto. Debe ser un número válido.");
            }
        } while (!cont);
        cont = false;
        do {
            try {
                System.out.println("Ingrese la velocidad (max/8km/h)");
                velocidad = Double.parseDouble(sc.nextLine());
                if (velocidad <= 8) {
                    cont = true;
                } else {
                    System.out.println("Se exedió del máximo.");
                    System.out.println("--------------------------------------\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("Dato incorrecto. Debe ser un número válido.");
            }
        } while (!cont);
        return new OrniVerde(nombre, cola, velocidad);
    }

    public static OrniAzul creadorDeOrniAzul(String nombre) {
        Scanner sc = new Scanner(System.in);
        double cola = 0;
        double velocidad = 0;
        double propulsion = 0;
        boolean cont = false;

        System.out.println("---Creando a OrniAzul " + nombre + "---");

        do {
            try {
                System.out.println("Ingrese la propulsión (entre 5/10km)");
                propulsion = Double.parseDouble(sc.nextLine());
                if (propulsion <= 10 || propulsion >= 5) {
                    cont = true;
                } else {
                    System.out.println("Se exedió del máximo.");
                    System.out.println("--------------------------------------\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("Dato incorrecto. Debe ser un número válido.");
            }
        } while (!cont);
        cont = false;
        do {
            try {
                System.out.println("Ingrese la medida de la cola (max/15cm)");
                cola = Double.parseDouble(sc.nextLine());
                if (cola <= 15) {
                    cont = true;
                } else {
                    System.out.println("Se exedió del máximo.");
                    System.out.println("--------------------------------------\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("Dato incorrecto. Debe ser un número válido.");
            }
        } while (!cont);        
        cont = false;
        do {
            try {
                System.out.println("Ingrese la velocidad (max/8km/h)");
                velocidad = Double.parseDouble(sc.nextLine());
                if (velocidad <= 8) {
                    cont = true;
                } else {
                    System.out.println("Se exedió del máximo.");
                    System.out.println("--------------------------------------\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("Dato incorrecto. Debe ser un número válido.");
            }
        } while (!cont);
        return new OrniAzul(nombre, propulsion, cola, velocidad);
    }

}
