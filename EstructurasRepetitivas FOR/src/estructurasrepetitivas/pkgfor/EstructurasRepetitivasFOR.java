/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasrepetitivas.pkgfor;

import java.util.Scanner;

/**
 *
 * @author Emanuel
 */
public class EstructurasRepetitivasFOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
      //ESTRUCTURA FOR
      /*
      for (<inicializacion>; <terminacion>; <incremento>{
      <sentencias>
      }
      */
      
      //EJEMPLO
     /* for (int i = 0; i<10; i++){
          System.out.println("Imprimo el valor de i: "+ i);
      }
        System.out.println("=============");
        
        
        System.out.println("For decreciendo");        
        for (int i = 10; i > 0; i--){
            System.out.println("Imprimo el valor de i: " + i);
        }
        
        */
        /*EJERCICIO 10
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 ** */
     
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese 4 numeros por favor");
        
        int num = leer.nextInt();
        int num2 = leer.nextInt();
        int num3 = leer.nextInt();
        int num4 = leer.nextInt();
        
        //IMPRIMIMOS EL NUMERO
        System.out.print(num);//PRINT SIN SALTO DE LINEA
        //INICIAMOS EL BUCLE PARA IMPRIMIR LOS *
        for (int i = 0; i < num ; i++) {
            System.out.print("*"); //PRINT SIN SALTO DE LINEA
        }
        //IMPRIMIMOS UN ESPACIO PARA HACERSALTO DE LINEA
        System.out.println("");
        
        //LO MISMO QUE ANTES PERO CON LOS SIGUIENTS NUMEROS
          System.out.print(num2);
        for (int i = 0; i < num2 ; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        
          System.out.print(num3);
        for (int i = 0; i < num3 ; i++) {
            System.out.print("*");
        }
         System.out.println("");
        
        
          System.out.print(num4);
        for (int i = 0; i < num4 ; i++) {
            System.out.print("*");
        }
        
   }
    
 }
