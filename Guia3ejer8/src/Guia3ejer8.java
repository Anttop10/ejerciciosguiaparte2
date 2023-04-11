
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
public class Guia3ejer8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner leer = new Scanner(System.in);
        
        System.out.println("Escriba una nota");
        
        int nota = leer.nextInt();
        
        while ( nota < 0 || nota > 10  ){
            System.out.println("La nota no es valida");
            System.out.println("Escriba otra  nota");
            nota = leer.nextInt();
                 
        }
        System.out.println("La nota es valida");
    }
        
                
     }
    

