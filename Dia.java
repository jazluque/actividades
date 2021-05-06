/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia;

import java.util.Scanner;

/**
 *
 * @author pc04
 */
public class Dia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    Scanner dias= new Scanner (System.in);
        System.out.println("Ingrese un numero para saber que dia es");
        int dia=dias.nextInt();
    String nomdia;
    switch (dia)
        { case 1: nomdia= "Lunes";
                  break;
            case 2: nomdia= "Martes";
                  break;
            case 3: nomdia= "Miércoles";
                  break;
            case 4: nomdia= "Jueves";
                  break;
            case 5: nomdia= "Viernes";
                  break;
            case 6: nomdia= "Sabado";
                  break;
            case 7: nomdia= "Domingo";
                  break;
            default: nomdia= "Dia invalido";
                     break;
        }
        System.out.println("nomdia");
            
        }
    }
    

