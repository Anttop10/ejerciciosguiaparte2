
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
public class ejercicioguia3practico8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int ladoCuadrado;
        System.out.print("Ingresa el tamaño del Lado del Cuadrado: ");
        ladoCuadrado = leer.nextInt();
        for (int i = 1; i <= ladoCuadrado; i++) {
            for (int j = 1; j <= ladoCuadrado; j++){
                if (i > 1 && i < ladoCuadrado && j > 1 && j < ladoCuadrado){
                    System.out.print("  ");
                }else {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }
    }
    
    


