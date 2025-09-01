/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
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
        System.out.println("Participantes: \n\t-Bossa José \n\t-Bongiovanni Naiara \n\t-Bonisoni Claudia \n\t-Achucarro"
                + "Gonzalo \n\t-Fet Enzo \n\t-García Emmanuel");
//Ejercicio 1 del main
        OrniVerde orni1 = Nacimiento.creadorDeOrniVerde("Naiara");
        System.out.println("---OrniVerde Creado--");
        orni1.mostrarInformacion();

        System.out.println("\n--------------------------------------\n");

        OrniAzul orni2 = Nacimiento.creadorDeOrniAzul("Blue");
        System.out.println("---Primer OrniAzul Creado--");
        orni2.mostrarInformacion();

        System.out.println("\n--------------------------------------\n");

        OrniAzul orni3 = Nacimiento.creadorDeOrniAzul("Blui");
        System.out.println("---Segundo OrniAzul Creado--");
        orni3.mostrarInformacion();

        System.out.println("\n--------------------------------------\n");
        Boolean cont = false;
        do {
            System.out.println("Ingresar al Menú de acciones de:"
                    + "\na): OrniVerde."
                    + "\nb): OrniAzul."
                    + "\nc): Salir.");
            String resp = sc.nextLine();

            switch (resp) {
                case "a":
                    orni1.menuDeAcciones();
                    break;
                case "b":
                    do {
                        System.out.println("Elija que Orni quiere que Nade "
                                + "\na)Blue."
                                + "\nb)Blui.");
                        resp = sc.nextLine();
                        if (resp.equalsIgnoreCase("a")) {
                            orni2.nadar();
                            break;
                        } else {
                            if (resp.equalsIgnoreCase("b")) {
                                orni3.nadar();
                                break;
                            } else {
                                System.out.println("Opción incorrecta. Vuelva a intentar");
                            }
                        }
                    } while ((!resp.equalsIgnoreCase("a")) || (!resp.equalsIgnoreCase("b")));
                    break;
                case "c":
                    System.out.println("Usted salió del menú.");
                    cont = true;
                    break;
                default:
                    System.out.println("Opción Inválida.");
            }
        } while (!cont);

        System.out.println("\n--------------------------------------\n");
//Ejercicio 2 del main      
        PadreCastor[] orniss = new PadreCastor[3];
        try {
            orniss[0] = orni2;
            orniss[1] = orni1;
            orniss[2] = orni3;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Fuera del límite.");
        } finally {
            System.out.println("Los ornitohermanos juntos al fin...");
        }
//Ejercicio 3 del main
           List<OrniAzul>listaNadadores = new ArrayList<>();
        listaNadadores.add(orni2);
        listaNadadores.add(orni3);
        listaNadadores.sort(Comparator.comparingInt(OrniAzul::getPropulsion));
    }
}
