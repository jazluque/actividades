/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circunferencia;
import java.util.Scanner;
/**
 *
 * @author marce_000
 */
public class Circunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Scanner key= new Scanner (System.in);
    double radio;
    double longitud;
    double area;
    double pi= 3.1416;
        System.out.println("ingresa el radio");
        radio= key.nextDouble();
        longitud= 2 * pi * radio;
        area= pi * Math.pow(radio, 2);
        System.out.println("la longitud de la circunferencia es igual a" + longitud );
        System.out.println("el area de la circunferencia es igual a" + area);
       
    }
    
}
