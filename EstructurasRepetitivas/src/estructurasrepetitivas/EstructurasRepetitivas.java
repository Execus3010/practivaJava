/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasrepetitivas;

import java.util.Scanner;

/**
 *
 * @author Emanuel
 */
public class EstructurasRepetitivas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //ESTRUCTURA WHILE
    
    /*
    
    while(<condición>){
    <sentencias>
    }
    
    */
    
    /* EJEMPLO
    Scanner leer = new Scanner(System.in);
    String respuesta ="S";
    
    while (respuesta.equalsIgnoreCase("S")){
        System.out.println("Desea continuar?");
        respuesta =  leer.nextLine();
        */
    
    /*EJERCICIO 8
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
pedirá de nuevo hasta que la nota sea correcta.*/
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una nota");  
        
        int nota = leer.nextInt();
        
        while(nota<0 || nota > 10){
            System.out.println("Ingrese otra nota por favor");
            nota=leer.nextInt();
            
        }
        System.out.println("La nota que usted ingreso es " + nota);
        
        
    }
  }
    
