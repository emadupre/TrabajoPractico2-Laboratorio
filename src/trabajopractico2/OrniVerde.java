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
    
    public OrniVerde(String nombre, double cola, double velocidad){
        super(cola, velocidad);
        this.nombre = nombre;
    }
    
    @Override
    public void tocarOrgano(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Do-Re-Mi (Presiona ENTER para continuar)");
        sc.nextLine();
        System.out.println("Fa-Sol-La-Si");
    }
    
    public void tocarGuitorgan(){
        super.tocarGuitarra();
        this.tocarOrgano();
        System.out.println("cuac... cuac..");
    }

    public String getNombre(){
        return nombre;
    }
    public void mostrarInformacion(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return nombre +" es un OrniVerde, tiene una cola que mide " + cola
                + "cm y su velocidad alcanza los" + velocidad + " km/h";
    }
    
    
}
