/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopractico2;

/**
 *
 * @author Enzo_2
 */
public class OrniAzul extends PadreCastor{
    private double propulsion;
    private String nombre;
    
    public OrniAzul(String nombre, double propulsion, double cola, double velocidad){
        super(cola, velocidad);
        this.nombre = nombre;
        this.propulsion = propulsion;
    }
    
    @Override
    public void nadar(){
        double velocidadTotal = propulsion + velocidad;
        System.out.println("Nada a " + velocidadTotal + "km/s");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }   
    

    public double getPropulsion() {
        return propulsion;
    }
    
    public void mostrarInformacion(){
        System.out.println(toString());
    }
    
    

    @Override
    public String toString() {
        return nombre +" es un OrniAzul, tiene una propulsion de " + propulsion + " km/h. Además su cola mide " + cola
                + " cm y su velocidad alcanza los " + velocidad + " km/h";
    }
    

}
