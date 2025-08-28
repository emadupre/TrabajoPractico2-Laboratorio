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
    
    public OrniAzul(double propulsion, double cola, double velocidad){
        super(cola, velocidad);
        this.propulsion = propulsion;
    }
    
    @Override
    public void nadar(){
        double velocidadTotal = propulsion + velocidad;
        System.out.println("Nada a " + velocidadTotal + "km/s");
    }

    public double getPropulsion() {
        return propulsion;
    }
    

}
