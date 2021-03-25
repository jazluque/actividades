/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 import java.util.Scanner;
/**
 *
 * @author pc10
 */
public class ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada=new Scanner (System.in);
    String nombre_alumno;
    double evaluacion1;
    double evaluacion2;
    double evaluacionfinal;
    System.out.println("nombre alumno:");
    nombre_alumno=entrada.nextLine();
    System.out.println("nota 1ra evaluacion");
    evaluacion1=entrada.nextDouble();
    System.out.println("nota 2da evaluacion");
    evaluacion2=entrada.nextDouble();
    evaluacionfinal= (evaluacion1+evaluacion2)/2;
    System.out.println("nota final"+evaluacionfinal);
    }
    
}
