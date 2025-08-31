/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopractico2;

import java.util.Random;

/**
 *
 * @author Enzo_2
 */
public class PadreCastor {
    protected double cola;
    protected double velocidad;
    
    public PadreCastor(double cola, double velocidad){
        this.cola = cola;
        this.velocidad = velocidad;
    }
    
    public void nadar(){
        System.out.println("Nadando a: " + velocidad + "km");
    }
    
    public void tocarGuitarra(){
        Random r = new Random();
        System.out.println("Toca cuerda " + r.nextInt(6) + 1);
    }

    @Override
    public String toString() {
        return "PadreCastor tiene cola de "+ cola + "cm y su velocidad alcanza los " + velocidad + "km/h";
    }
    
    
}
