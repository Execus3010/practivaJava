/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Emanuel
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // EJERCICIO4
        /*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
        Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
        
        System.out.println("Ingrese una cantidad de grados en centigrados");
        Scanner leer = new Scanner(System.in);
        
        int cent = leer.nextInt();
        
        double fah = 32 + (9 * cent / 5);
        
        System.out.println("El numero traducido a Fahrenheit es " + fah);
        
    }
    
}
