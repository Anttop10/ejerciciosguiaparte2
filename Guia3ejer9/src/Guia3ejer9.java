
import java.util.Scanner;

/*
 *Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del bucle 
y mostrar el mensaje "Se capturó el numero cero".  
El programa deberá calcular y mostrar el resultado de la suma de los números leídos, 
pero si el número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
/**
 *
 * @author personal
 */
public class Guia3ejer9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un numero");
        int contador = 0;
        int numero ;
        int suma = 0;
        do{
       numero =leer.nextInt();    
       contador ++;
       suma = suma + numero;
        }
        
        while ( numero != 0);  
                
     System.out.println("Se capturó el numero cero");
      System.out.println("La suma de los numeros ingresados es " + suma );
     
        }
       }
      

