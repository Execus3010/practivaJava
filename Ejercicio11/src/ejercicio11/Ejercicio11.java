/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author Emanuel
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // EJERCICIO 11
        /*Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
        El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.*/
        
        Scanner leer = new Scanner(System.in);       
        System.out.println("Ingrese dos numeros enteros");
        double num1 = leer.nextInt();
        double num2 = leer.nextInt();        
        System.out.println("Ahora elija una operacion a realizar"); 
        
        String res="n";
        
        
        
        while(res.equals("n")){
                System.out.println("MENU\n" +
                            "1. Sumar\n" +
                            "2. Restar\n" +
                            "3. Multiplicar\n" +
                            "4. Dividir\n" +
                            "5. Salir");
                
                int menu = leer.nextInt();
            
        switch (menu){
            case 1:
                System.out.println("El resultado de la suma de sus numeros es "+ (num1+num2));
                break;
                
            case 2:
                System.out.println("El resultado de la resta de sus numeros es "+ (num1-num2));
                break;
            case 3:
                System.out.println("El resultado de la multiplicacion de sus numeros es " + (num1*num2));
                break;
            case 4:   
                System.out.println("El resultado de la division de sus numeros es "+ (num1/num2));
                break;
            case 5 :                
                System.out.println("Estas seguro?");
                res = leer.next();
                  break;            
          }
                
      }        
        System.out.println("Hasta pronto :D");
        
        
        
        
        
    }
    
}
