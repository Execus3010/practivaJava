/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author Emanuel
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // VECTORES Y MATRICES
       
       //CREACION Y DECLARACION DE VECTOR
       /*TIPO[] arregloV = new tipo[tamaño];
       
       DECLARACION Y CREACION DE UNA MATRIZ
               TIPO[] arregloM = new tipo[filas][columnas];
     
       */
       
       // EJEMPLOS
      //Creo n arreglo llamado vector con dimension 5
      //dolo puedo alojar numeros enteros en el
      int [] vector = new int[5];
      
      
      //Creo una matriz con dimencion 3x3
      //Solo puedo alojar cadenas en ella
      
      String[][] matriz = new String[3][3];
      
      
      /*EJERCICIO 13
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.*/
      
      String [] equipo = new String[3];
      
      /*
      ASIGNAR VALOR DE UN VECTOR
      vector[0] = 5;
      
      ASIGNAR VALOR A UNA MATRIZ
      matriz[0][0] = 6;
      
      
      */
      
      
      
      
      //ASIGNAR VALORES A UN VECTOR
        for (int i = 0; i < 5; i++) {
            vector[i] = 5;
            
        }
        
        //ASIGNAR VALOR A UNA MATRIZ
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = "A";
            }           
        }
        
            //MOSTRAR POR PANTALLA
            
            //VECTOR
            for (int i = 0; i < 5; i++) {
                System.out.print("[" + vector[i] + "]");
        }
            System.out.println("");  
            
            //MATRIZ
            
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("[" + matriz[i][j] + "]");
                }
                System.out.println("");
        }
            
            
            /*EJERCICIO 14
Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo*/
            Scanner leer = new Scanner(System.in);
            for (int i = 0; i < 3; i++) {
            equipo[i] = leer.nextLine();
        }
            
            for (int i = 0; i < 3; i++) {
                System.out.println("El nombre del " + i + " integrante es"  + equipo[i]);
        }
    }
    
    
    
}
