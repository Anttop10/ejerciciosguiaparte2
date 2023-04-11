/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3ejercicio5;

import java.util.Scanner;

/**
 *
 * @author romer
 */
public class Guia3Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escriba un programa en el cual se ingrese un valor limite positivo, 
        y a continuacion solicite numeros al usuario hasta que la suma de los 
        numeros introducidos supere el limite inicial.*/
        Scanner leer = new Scanner (System.in);
        double num,num2,suma=0;
        System.out.println("Por favor ingrese un limite");
        num = leer.nextDouble();
        /*INT=ENTERO,DOUBLE=REAL,BOOLEAN=LOGICO*/
        /*double/int/boolean debe coincidir con el leer.[tipodedato]()*/
        do {            
            System.out.println("Ingrese un numero");
            num2=leer.nextDouble();
            suma=suma+num2;
        } while (suma<num);
        System.out.println("La suma superó el limite indicado");
        
        
    }
    
}
