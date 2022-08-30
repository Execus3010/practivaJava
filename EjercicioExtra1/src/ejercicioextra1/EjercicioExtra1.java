/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra1;

import java.util.Scanner;

/**
 *
 * @author Emanuel
 */
public class EjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio Extra 1:
        /*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.*/
        Scanner leer = new Scanner(System.in);
        
        int min, dias, horas, min2;
        
        System.out.println("Ingrese una cantidad de minutos");
        min=leer.nextInt();
        
        dias=min/1440;
       // horas=min%1440/60;
        horas=(min-1440)/60;
        min2=min%60;
        
        System.out.println("La cantidad de minutos ingresados equivalen a :");
        System.out.println(dias + " dias");
        System.out.println(horas + " horas");
         System.out.println(min2 + " minutos");
    }
   
    
}
