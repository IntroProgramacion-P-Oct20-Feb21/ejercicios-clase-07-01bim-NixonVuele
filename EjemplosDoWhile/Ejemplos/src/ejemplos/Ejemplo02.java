/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadenaFinal = "";
        double nota;
        boolean bandera = true;
        String salida;
        double calificaciones=0;
        int divisor=0;
        double promedio;
        do{
            System.out.println("Ingrese calificaciones");
            nota = entrada.nextDouble();
            calificaciones = calificaciones +nota;
            divisor=divisor+1;
            cadenaFinal = String.format("%s%.2f\n", cadenaFinal, nota);
            entrada.nextLine(); // limpieza de buffer
            
            System.out.println("Ingrese (s) si desea salir del ciclo ");
            salida = entrada.nextLine();
            
            if (salida.equals("s")) {
                bandera = false;
            }
            
        }while(bandera); // (bandera==true)
        promedio=calificaciones/divisor;
        System.out.printf("Listado de Notas\n%s\nPromedio final: %.2f\n",
                cadenaFinal,promedio);
    }
}
