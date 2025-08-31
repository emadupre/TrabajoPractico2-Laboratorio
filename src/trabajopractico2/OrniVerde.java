/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico2;

import java.util.Scanner;

/**
 *
 * @author emadupre
 */
public class OrniVerde extends PadreCastor implements MamaPata {

    private String nombre;   
    

    public OrniVerde(String nombre, double cola, double velocidad) {
        super(cola, velocidad);
        this.nombre = nombre;
    }

    @Override
    public void tocarOrgano() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do-Re-Mi (Presiona ENTER para continuar)");
        sc.nextLine();
        System.out.println("Fa-Sol-La-Si");
    }

    public void tocarGuitorgan() {
        super.tocarGuitarra();
        this.tocarOrgano();
        System.out.println("cuac... cuac..");
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarInformacion() {
        System.out.println(toString());
    }

    public void menuDeAcciones() {
        Scanner sc = new Scanner(System.in);
        Boolean continuar = true;
        while (continuar) {
            System.out.println("Bienvenido al menú de acciones de Orni Naiara!"
                    + "\nUsted desea: "
                    + "\n\ta): Toque una canción con el Órgano."
                    + "\n\tb): Toque una canción con la Guitarra."
                    + "\n\tc): Toque la Guitarra y el Órgano."
                    + "\n\td): Orni Nade!");
            String opcion = sc.nextLine();
            Boolean continuar1 = true;
            switch (opcion) {
                case "a":
                    tocarOrgano();
                    break;
                case "b":
                    super.tocarGuitarra();
                    break;
                case "c":
                    tocarGuitorgan();
                    break;
                case "d":
                    super.nadar();
                    break;
                default:
                    System.out.println("Opción inválida!");
                    continue;
            }

            while (continuar1) {
                System.out.println("--Desea volver al MENÚ--"
                        + "\n\tSi/No.");
                opcion = sc.nextLine();

                if (opcion.equalsIgnoreCase("Si")) {
                    continuar1 = false;
                } else {
                    if (opcion.equalsIgnoreCase("No")) {
                        System.out.println("--Usted salió del MENÚ--");
                        continuar1 = false;
                        continuar = false;
                    } else {
                        System.out.println("Respuesta incorrecta");
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        return nombre + " es un OrniVerde, tiene una cola que mide " + cola
                + " cm y su velocidad alcanza los " + velocidad + " km/h";
    }

}
