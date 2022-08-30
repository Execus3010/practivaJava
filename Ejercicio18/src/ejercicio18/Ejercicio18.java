/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18;

/**
 *
 * @author Emanuel
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //EJERCICIO 18:
       /*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).*/
       
       int[][] matriz =new int[4][4];
       int random = (int)(Math.random()*9);
       
       //RELLENAR UNA MATRIZ
        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 4; columna++) {
                matriz[fila][columna] = (int)(Math.random()*9);
                System.out.print(matriz[fila][columna]+" ");
            }
            System.out.println(" ");
        }
        
        System.out.println("=======");
        
        //IMPRIMIR MATRIZ
        
         for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 4; columna++) {
           System.out.print(matriz[columna][fila]+" ");
            }
            System.out.println(" ");
        }
        
        
    }
    
}
