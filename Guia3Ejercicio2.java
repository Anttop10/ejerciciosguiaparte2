/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3ejercicio2;

import java.util.Scanner;

/**
 *
 * @author romer
 */
public class Guia3Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Crear un programa que pida una frase y si esa frase es igual a “eureka” el
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
Incorrecto. Nota: investigar la función equals() en Java.*/
        Scanner leer = new Scanner(System.in);
        String frase2= "eureka";
       /* DEFINIR COMO CARACTER*/ String frase;
        System.out.println("Ingrese una frase ");
        frase= leer.nextLine();/* LEE LA FRASE*/
        if (frase.equalsIgnoreCase(frase2)){ /* COMPARAMOS FRASE CON FRASE2 TIENEN Q SER IGUALES*//*EQUALS TOMA EN CUENTA MINUS Y MAYUS; EQUALSIGNORECASE NO*/
            System.out.println("CORRECTO");
        } else{
            System.out.println("INCORRECTO");
                     
        }
        
        
        
        
        
        // TODO code application logic here
    }
    
}
