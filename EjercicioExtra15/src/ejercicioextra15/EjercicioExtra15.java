/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra15;

import java.util.Scanner;

/**
 *
 * @author Emanuel
 */
public class EjercicioExtra15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // EJERCICIO EXTRA 15:
        /*Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.*/
        
        Scanner leer = new Scanner(System.in);
        int num1, num2, operacion,resultado;
        
        System.out.println("Ingrese su primer numero");
        num1 = leer.nextInt();
        System.out.println("Ingrese su segundo numero");
        num2 = leer.nextInt();
        System.out.println("Elija una operacion a realizar");
        System.out.println("1.Sumar \n"+"2.Restar \n"+"3.Multiplicar \n"+"4.Dividir");
        operacion = leer.nextInt();
        
        switch (operacion){
            case 1:
                resultado=sumar(num1, num2);
                System.out.println("El resultado de su operacion es: "+resultado);             
                break;
            case 2:
                resultado=resta(num1, num2);
                System.out.println("El resultado de su operacion es: "+resultado);                
                break;
            case 3:
                resultado=multiplicar(num1,num2);
                System.out.println("El resultado de su operacion es: "+resultado);                
                break;
            case 4:
                resultado=dividir(num1,num2);
                System.out.println("El resultado de su operacion es: "+resultado);                
                break;
        }
        
    }

    public static int sumar(int num1, int num2){
        int res = num1 + num2;
        return res;
        
    }
    
    
    public static int resta (int num1, int num2){
          int res;
        if (num1 < num2) {
            res = num2 - num1;
            
        }else{
             res = num1 - num2;
        }
        return res;
        
    }
    
    public static int multiplicar (int num1, int num2){
        int res = num1 * num2;
        
        return res; 
               
    }
    
    public static int dividir(int num1, int num2){
        Scanner leer = new Scanner(System.in);
         int res=num1/num2;
         
        if (num1< num2){
            
            System.out.println("Su primer numero es menor al segundo, intenta de nuevo");
            num1 = leer.nextInt();
            num2 = leer.nextInt();
            dividir(num1,num2);
            res=num1/num2; 
        }       
        return res;
    }
    
}
