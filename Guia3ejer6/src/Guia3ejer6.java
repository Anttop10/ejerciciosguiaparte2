
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author personal
 */
public class Guia3ejer6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos numeros ");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        
        if(num1 > 25){
            System.out.println("El numero ingresado: " + num1 + " es mayor a 25"); 
        }else if (num1 == 25 ) {
            System.out.println("El  numero ingresado: " + num1 + " es igual a 25");
        } else {
            System.out.println("El numero ingresado: "  + num1 + " es menor a 25");
        }
        
        if(num2 > 25){
            System.out.println("El  numero ingresado: " + num2 + " es mayor a 25"); 
        }else if (num1 == 25 ) {
            System.out.println("El  numero ingresado: " + num2 + " es igual a 25");
        } else {
            System.out.println("El  numero ingresado: "  + num2 + " es menor a 25");
        }
  
    
    }
    }