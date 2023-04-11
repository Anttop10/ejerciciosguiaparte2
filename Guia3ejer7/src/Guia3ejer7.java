
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
public class Guia3ejer7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tipo de Motor");
        
        int tipoMotor = leer.nextInt();
        
       switch (tipoMotor) {
           case 1:
               System.out.println("La bomba es una bomba de agua");
               break;
           case 2: 
               System.out.println("La bomba es una bomba de gasolina");
               break;
           case 3:
               System.out.println("La bomba es una bomba de hormigón");
               break;
           case 4:
               System.out.println("La bomba es una bomba de pasta alimenticia");
           default:
               System.out.println("No existe un valor válido para tipo de bomba");
       }
    }
    
    }
    

