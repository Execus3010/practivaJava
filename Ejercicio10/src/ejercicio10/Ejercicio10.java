/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author Emanuel
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // EJERCICIO 10
        /*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
  números al usuario hasta que la suma de los números introducidos supere el límite inicial.*/
         Scanner leer = new Scanner(System.in);  
         
        System.out.println("Ingrese un valor limite positivo");             
        int num_limite = leer.nextInt();
        
        System.out.println("Ingrese numeros hasta que la suma supere su limite");
        int suma = 0;
        
        while(suma<=num_limite){
            int num = leer.nextInt();
            suma=suma+num;
        }
        System.out.println("La suma de sus numeros es "+ suma);
        
        
        
        
    }
    
}
