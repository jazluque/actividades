/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caracter;

import java.util.Scanner;
import static javafx.scene.input.KeyCode.O;

/**
 *
 * @author pc04
 */
public class Caracter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Scanner entrada= new Scanner (System.in);
    char caracter;
    System.out.println("Ingrese un caracter para saber si es vocal");
    caracter= entrada.next().charAt(0);
    switch (caracter)
     { case 'a': System.out.println("El caracter es una vocal, es la A");
                break;
       case 'b': System.out.println("El caracter es una vocal, es la E");
                break;
       case 'c': System.out.println("El caracter es una vocal, es la I");
                  break;
       case 'd': System.out.println("El caracter es una vocal, es la O");
                 break;
       case 'e': System.out.println("El caracter es una vocal, es la U");
                 break;
       default: System.out.println("El caracter no es una vocal");
                break;
    }
    
    
    }
    
    }
