
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
public class guia3extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String letra;  //defino variable
    System.out.println("ingrese la letra a analizar"); //muestro mensaje
    Scanner leer = new Scanner(System.in);//cargo ingreso por teclado
    letra = leer.next();//programa lee
    if  ("a".equalsIgnoreCase(letra) || "e".equalsIgnoreCase(letra) || "i".equalsIgnoreCase(letra) || "o".equalsIgnoreCase(letra) || "u".equalsIgnoreCase(letra)) {
       System.out.println("La letra ingresada es una vocal ! ");
    } else {
     System.out.println("La letra ingresada NO es una vocal");
    }
    
}
}

