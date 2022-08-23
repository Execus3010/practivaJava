/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Emanuel
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EJERCICIO 8
        /*Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.*/
        
        System.out.println("Por favor ingrese una frase o palabara que no supere los 8 caracteres");
        
        Scanner leer = new Scanner(System.in);
        
        String palabra = leer.nextLine();
        int log = palabra.length();
        
        if (log <= 8) {
            System.out.println("Lo hiciste bien");
        }else{
            System.out.println("Intenta con una palabra mas corta :/");
        }
           
    }
    
}
