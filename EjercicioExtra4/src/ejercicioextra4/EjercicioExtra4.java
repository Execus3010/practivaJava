/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra4;

import java.util.Scanner;

/**
 *
 * @author Emanuel
 */
public class EjercicioExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio Extra4:
        /*Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
    equivalente en romano.*/
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ungrese un numero del 1 al 10");
        int num = leer.nextInt();
        
        switch(num){
            case 1:
                System.out.println("Su numero traducido a romano seria: I");
                break;
            case 2:
                System.out.println("Su numero traducido a romano seria: II");
                break;
            case 3:
                System.out.println("Su numero traducido a romano seria: III");
                break;
            case 4:
                System.out.println("Su numero traducido a romano seria: IV");
                break;
            case 5:
                System.out.println("Su numero traducido a romano seria: V");
                break;
            case 6:
                System.out.println("Su numero traducido a romano seria: VI");
                break;
            case 7:
                System.out.println("Su numero traducido a romano seria: VII");
                break;
            case 8:
                System.out.println("Su numero traducido a romano seria: VIII");
                break;
            case 9:
                System.out.println("Su numero traducido a romano seria: IX");
                break;
            case 10:
                System.out.println("Su numero traducido a romano seria: X");
                break;
        }
    }
    
}
