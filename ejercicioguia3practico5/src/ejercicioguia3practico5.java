
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
public class ejercicioguia3practico5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         /*Escriba un programa en el cual se ingrese un valor limite positivo, 
        y a continuacion solicite numeros al usuario hasta que la suma de los 
        numeros introducidos supere el limite inicial.*/
        Scanner leer = new Scanner (System.in);
        double num,num2,suma=0;
        System.out.println("Por favor ingrese un limite");
        num = leer.nextDouble();
        /*INT=ENTERO,DOUBLE=REAL,BOOLEAN=LOGICO*/
        /*double/int/boolean debe coincidir con el leer.[tipodedato]()*/
        do {            
            System.out.println("Ingrese un numero");
            num2=leer.nextDouble();
            suma=suma+num2;
        } while (suma<num);
        System.out.println("La suma superó el limite indicado");
        
    }
    
}

/*public class ejercicioguia3practico5 {

public static void main(String[] args) {
}
int num;
int valorsuma;
int resultado = 0;

Scanner scanner = new Scanner(System.in);

System.out.println("Indique un valor máximo");
num = scanner.nextInt();

do {
System.out.println("Ingrese un numero a sumar");
valorsuma = scanner.nextInt();

resultado = valorsuma + resultado;


} while ( resultado <= num);

System.out.println("Sobrepasaste el valor máximo, tu numero inicial fue : " + num + ".Y el valor que ingresaste fue de: " + resultado );
}
}*/