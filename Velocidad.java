/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package velocidad;
import java.util.Scanner;
/**
 *
 * @author marce_000
 */
public class Velocidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Scanner key= new Scanner (System.in);
    float velocidad;
    float resultado;
        System.out.println("ingresa la velocidad en km/h");
        velocidad= key.nextInt();
        resultado= velocidad / 3.6f;
        System.out.println("la velocidad ingresada es igual a" + resultado + "m/s");
    }
    
}
