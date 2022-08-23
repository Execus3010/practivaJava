/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Emanuel
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //EJERCICIO 5 
       /*Escribir un programa que lea un número entero por teclado y muestre por pantalla el
        doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().*/
       
        System.out.println("Ingrese un numero por favor");
        Scanner leer = new Scanner(System.in);
        
        double num = leer.nextInt();
        System.out.println("El doble de su numero es " + num * 2);
        System.out.println("El triple de su numero es " + num * 3);
        System.out.println("La raiz cuadrada de su numero es " + Math.sqrt(num));
    }
    
}
