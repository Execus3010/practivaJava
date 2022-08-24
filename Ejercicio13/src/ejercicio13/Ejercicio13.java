/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

import java.util.Scanner;

/**
 *
 * @author Emanuel
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // EJERCICIO 13
        /*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
        */
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un tamaño para su cuadrado");
        int tamano = leer.nextInt();
        
        for (int fila = 0; fila < tamano; fila++) {
            for (int columna = 0; columna < tamano; columna++) {
                if (fila==0|| fila == tamano-1 || columna==0 || columna == tamano-1) {
                    System.out.print("*");
                            
                }else{
                System.out.print(" ");
            }
        }
            System.out.println("");
    }
   }
}
