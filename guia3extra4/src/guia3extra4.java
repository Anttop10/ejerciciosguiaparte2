
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
public class guia3extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int numero;
        System.out.println("Ingrese el numero a convertir por notacion Romana: ");
        numero = leer.nextInt();
        switch(numero){
                case 1:
                    System.out.println("El equivalente en Romano es I");
                break;
                case 2:
                    System.out.println("El equivalente en Romano es II");
                break;
                case 3:
                    System.out.println("El equivalente en Romano es III");
                break;
                case 4:
                    System.out.println("El equivalente en Romano es IV");
                break;
                case 5:
                    System.out.println("El equivalente en Romano es V");
                break;
                case 6:
                    System.out.println("El equivalente en Romano es VI");
                break;
                case 7:
                    System.out.println("El equivalente en Romano es VII");
                break;
                case 8:
                    System.out.println("El equivalente en Romano es VIII");
                break;
                case 9:
                    System.out.println("El equivalente en Romano es XI");
                break;
                case 10:
                    System.out.println("El equivalente en Romano es X");
                break;
                default:
                    System.out.println("Debe ingresar una opcion valida");
        }
    }
    
}
