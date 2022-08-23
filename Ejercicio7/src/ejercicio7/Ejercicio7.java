/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Emanuel
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EJERCICIO 7
        /*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
    pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
    la función equals() en Java.*/
        
        System.out.println("Tenes que adivinar nuestra palabra secreta ;D");
        Scanner leer = new Scanner(System.in);
        
        String palabra = leer.nextLine();
        
        if (palabra.equals("eureka")) {
            System.out.println("Felicidades la adivinaste :D");
            
        }else{
            System.out.println("Mejor suerte la proxima :(");
        }
    }
    
}
