
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
public class guia3extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        int min, hrs, dias;
        dias=0;
        hrs=0;
        System.out.println("Ingrese la cantidad de minutos a calcular");
        min = leer.nextInt(); //pedimos la cantidad de minutos
        do { //este bucle se va a repetir todas las veces que sea necesario para contar los dias
          if (min>=1440) { //cada dia tiene 1440, entonces si pasamos esa cantidad de minutos, sumamos uno a dias...
           dias++;
           min= min-1440; //esta resta es para condicionar las vueltas del bucle segun sumemos dias
        }  
        } while (min>1440); //cuando ya no queden minutos equivalentes a un dia, se termina y seguimos con las horas... 
        do { //este bucle hace lo mismo que el anterior, va a incrementar en uno la hora siempre que minutos sea mayor a 60
          if (min>=60) {
           hrs++;
           min= min-60; //esta resta es para condicionar las vueltas del bucle segun sumemos horas
        }  
        } while (min>60); // el bucle se cortara cuando ya no queden minutos equivalentes a una hora. 
        
        System.out.println("La cantidad de minutos es igual : " +  dias + " dias "  +  hrs  + " horas: "  );
      
     
    }
        
}

