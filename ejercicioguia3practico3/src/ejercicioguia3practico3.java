
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
public class ejercicioguia3practico3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String frase; //creamos la variable frase como cadena
        Scanner leer = new Scanner(System.in); // creamos el scanner
        System.out.println("Ingrese la frase, debe tener solo 8 letras"); //pedimos la frase
        frase = leer.nextLine(); // guardamos lo que ingresamos en frase 
        if ( frase.length()== 8) { //condicional si la long de frase es igual a 8... (hay que importar la utilidad)
             System.out.println("la longitud es correcta ! ");
        } else { // sino 
            System.out.println("La longitud es incorrecta");
        }
    }
    
}
