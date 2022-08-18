/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionalesjava;

import java.util.Scanner;

/**
 *
 * @author Emanuel
 */
public class CondicionalesJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ESTRUCTURA IF:        
        /* 
        if(<condicion>){
        <sentensias>
        }
        */
        
        //ESTRUCTURA IF ELSE:
        /*        
        if(<condicion>)ñ
        <sentensias A>
        } else{
        <sentensias B>
        }        
        */
        
        //CONDICION IF ELSE-IF
        /*
       if (<condicion1>) {
         <sentencias A>
        } else if(<condicion2>){
            <sentencias B>
        } else {
        <sentencias C>
        }
        */
        
        
        //EJEMPLO PRACTICO
        
       /* int num1 = 5;
        int num2 = 7;
        
        if (num1 < num2){
            System.out.println("La variable num aloja un numero menor a la variablre num2");
        }else{
            System.out.println("La variable num1 aloja un numero mayor a la variable num2");
            */
       
            /*EJERCICIO 6
            Implementar un programa que le pida dos numeros enteros a usuario y determine 
            si ambos o alguno de ellos es mayor a 25.*/
           
            /*
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese dos numeros");
            int numU1 = leer.nextInt();
            int numU2 = leer.nextInt();
            
            if (numU1 > 25 && numU2 > 25){
            System.out.println("Ambos numeros son mayores a 25");  
                  
             }else if (numU1 > 25){
                System.out.println("El primer numero que ingreso es mayor a 25");
             }else if (numU2 > 25){
                 System.out.println("El segundo numero que ingreso es mayor a 25");
             }else{
                 System.out.println("Ninguno de los numeros ingresados es mayor a 25");
             }
            */
            
            
            //ESTRUCTURA SWITCH
            /*
            switch(<variable>) {
                case <valor1>:
                <sentencias1>
                break;
                case <valor2>:
                <sentencias2>
                break;
                default:
                <sentencias3>
                }
            */
            
            /*EJERCICIO 7
Considera que estás desarrollando una web para una empresa que fabrica motores (suponemos
que se trata del tipo de motor de una bomba para mover fluidos). Definir una variable tipoMotor y
permitir que el usuario ingrese un valor entre 1 y 4. El programa debe mostrar lo siguiente:
o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de
gasolina”.
o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de
hormigón”.
o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta
alimenticia”.
o Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor
válido para tipo de bomba”*/
            
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingresse un valor del 1 al 4");
            int tipoMotor = leer.nextInt();
            
            switch (tipoMotor){
                case 1:
                    System.out.println("La bomba es una bomba de agua");
                    break;
                case 2:
                    System.out.println("La bomba es una bomba de gasolina");
                    break;
                case 3:
                    System.out.println("La bomba es una bomba de hormigon");
                    break;
                case 4:
                    System.out.println("La bomba es una bomba de pasta alimenticia");
                    break;
                default:
                    System.out.println("No existe un valor valido para el tipo de bomba");
            }
            
        }
    }
    

