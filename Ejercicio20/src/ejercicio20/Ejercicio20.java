/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20;

import java.util.Scanner;

/**
 *
 * @author Emanuel
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio20:
       /* Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.*/
       
       Scanner leer = new Scanner(System.in);
        int[][] cuadrado = new int[3][3];
        int sumaFilas = 0, sumaColumnas = 0, sumaDiagon=0, sumaDiagon2;
        int fila1=0, fila2, fila3, columna1, columna2, columna3, diagon1, diagon2;
        
        
        
        //llENAR EL CUADRADO
        System.out.println("Vamos crear un cuadrado de numeros");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cuadrado [i][j] = leer.nextInt();
               }
            
        }
           /*  
        //MOSTRAR EL CUADRADO
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {              
            System.out.print(cuadrado[i][j]+" ");
            }
            System.out.println(" ");
        }*/
     
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumaFilas=sumaFilas+cuadrado[i][j];
                System.out.print(cuadrado[i][j]+" ");
                 sumaColumnas=sumaColumnas+cuadrado[j][i];
                 
                 if (i==j) {
                   sumaDiagon=sumaDiagon+cuadrado[i][j];
                }
                 
            }
           
            System.out.println(" = " + sumaFilas);
            sumaFilas=0;
            System.out.println(sumaColumnas+"===");
            sumaColumnas=0;
            
        }
        sumaDiagon2=cuadrado[2][0]+cuadrado[1][1]+cuadrado[0][2];
        System.out.println(sumaDiagon2+"diago2");
        System.out.println(sumaDiagon+"diago");
        
        
        
   
        
        
    }
    
}
