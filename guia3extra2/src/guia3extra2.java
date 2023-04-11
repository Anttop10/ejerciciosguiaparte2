/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author personal
 */
public class guia3extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=5;
        int b=2;
        int c=10;
        int d=8;
        int aux;
        System.out.println("El valor asignado a A es: "+ a);
        System.out.println("El valor asignado a B es: "+ b);
        System.out.println("El valor asignado a C es: "+ c);
        System.out.println("El valor asignado a D es: "+ d);
        
        System.out.println("Efectuando las operaciones para que B tome el valor de C...");
        aux=b;
        b=c;
        System.out.println("cambiado el valor, B tomo el valor de C y ahora es igual a: " +b);
        System.out.println("...");
        System.out.println("Efectuando las operaciones para que C tome el valor de A...");
        c=a;
        System.out.println("cambiado el valor, C tomo el valor de A y ahora es igual a: " +c);
        System.out.println("...");
        System.out.println("Efectuando las operaciones para que A tome el valor de D...");
        a=d;
        System.out.println("cambiado el valor, A tomo el valor de D y ahora es igual a: " +a);
        System.out.println("...");
        System.out.println("Efectuando las operaciones para que D tome el valor de B...");
        d=aux;
        System.out.println("cambiado el valor, D tomo el valor de B y ahora es igual a: " +d);
        System.out.println("...");
        System.out.println("...");
        System.out.println("El valor nuevo asignado a A es: "+ a);
        System.out.println("El valor nuevo asignado a B es: "+ b);
        System.out.println("El valor nuevo asignado a C es: "+ c);
        System.out.println("El valor nuevo asignado a D es: "+ d);
    }
    
}
