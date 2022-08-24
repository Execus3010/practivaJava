/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author Emanuel
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // EJERCICIO 16:
        /*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido*/
        Scanner leer = new Scanner(System.in);
        int n = (int) (Math.random() * 10);
        int[] num = new int[n]; 
        
        for (int i = 0; i < n; i++) {
            num[i]= (int)(Math.random() * 100);
            System.out.println(num[i]);
        }
        System.out.println("Busquemos si tu numero esta en mi lista :D");
        int numU = leer.nextInt();
        
        for (int i = 0; i < n; i++) {
            if (numU==num[i]) {
                System.out.println("Su numero se encuentra en la posición " + i);
                break;
            }
        }
    }
    
}
