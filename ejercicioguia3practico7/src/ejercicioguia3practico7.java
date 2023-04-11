
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
public class ejercicioguia3practico7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
    Scanner leer = new Scanner(System.in);
        String cadena, letraX, letraO;
        int cadenaCorr=0, cadenaInco=0;

        do {

            System.out.println("Ingrese su cadena de 5 caracteres con formato (X###O)");
            cadena = leer.nextLine();
           // letraX = cadena.substring(0, 1);
           // letraO = cadena.substring(3, 4);

            int longitud = cadena.length();
            
            if (cadena.equals("&&&&&")){
                break;
            }

            if (cadena.substring(0, 1).equals("X") && (cadena.substring(3, 4).equals("O")) && (cadena.length()==5)) {
                cadenaCorr++;

             } else {
                cadenaInco++;

                
                
            }
        }
        while (!cadena.equals("&&&&&"));
        System.out.println("La cantidad de cadenas ingresadas correctas es: "+ cadenaCorr);
        System.out.println("La cantidad de cadenas ingresadas Incorrectas es: " +cadenaInco);
            
        }
        
        }
    
    

