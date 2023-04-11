
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
public class guia3extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner leerprecios = new Scanner(System.in);
        String socio;
        double tratamiento, costo;
        boolean opc = false;

        

        do {
            System.out.println("Ingrese el tipo de socio, por favor (A,B,C)");
        socio = leer.nextLine();
        socio = socio.toLowerCase();
            switch (socio) {
                case "a":
                    System.out.println("Usted selecciono: Socios -A-(Beneficios del %50 en el costo del tratamiento).");
                    System.out.println("Ingrese el monto del tratamiento: ");
                    tratamiento = leerprecios.nextDouble();
                    costo = tratamiento * 0.5;
                    System.out.println("El costo del tratamiento para este afiliado es de " + costo + " pesos.");
                    opc=true;
                    break;
                case "b":
                    System.out.println("Usted selecciono: Socios -B-(Beneficios del %35 en el costo del tratamiento).");
                    System.out.println("Ingrese el monto del tratamiento: ");
                    tratamiento = leerprecios.nextDouble();
                    costo = tratamiento * 0.35;
                    System.out.println("El costo del tratamiento para este afiliado es de " + costo + " pesos.");
                    opc=true;
                    break;
                case "c":
                    System.out.println("Usted selecciono: Socios -C-(Sin beneficios en el costo del tratamiento).");
                    System.out.println("Ingrese el monto del tratamiento: ");
                    tratamiento = leerprecios.nextDouble();
                    costo = tratamiento;
                    System.out.println("El costo del tratamiento para este afiliado es de " + costo + " pesos.");
                    opc=true;
                    break;
                default:
                    System.out.println("Debe seleccionar una opcion correcta...");
                    opc = false;
                    break;
            }
        } while (opc == false);

    }

   }