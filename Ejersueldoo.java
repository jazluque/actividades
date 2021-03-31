/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejersueldoo;

/**
 *
 * @author marce_000
 */
public class Ejersueldoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
        System.out.println("precio de cada hora");
        System.out.println("horas realizadas en un mes");
    
    int a=teclado.nextInt;
    int b=teclado.nextInt;
    int sueldomensual= a*b;
    int sueldoanual= sueldomensual*12;
    
        System.out.println("el sueldo mensual es igual a:" +sueldomensual);
        System.out.println("el sueldo anual es igual a:" +sueldoanual);
    }
    
}
