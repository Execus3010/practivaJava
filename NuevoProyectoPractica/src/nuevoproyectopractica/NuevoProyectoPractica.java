/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevoproyectopractica;

/**
 *
 * @author Emanuel
 */
public class NuevoProyectoPractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //EJERCICIO 1
        //DEFINIR VARIABLES PRIMITIVAS 
        String nombre2;
        int numero;
        double decimales;
        
        String myName;
        int num1;
        boolean ban;
        
        String nombre;
         boolean bandera;
        char charo;
        
        //EJERCICIO 2
        //ASIGNACION DE VALORES        
        nombre = "Emanuel Ledesma";
        numero = 28;
        decimales = 29.9;
        
        //OPERADORES
        //EJERCICIO 3 (PRACTICA OPERADORES)
        
        int num2 = 5;
        int num3 = 2;
        
        int suma = num2 + num3;
        double division = num2 / num3;
        boolean banderados = num3 < num2;
        
        num2++;
        /*
        //MOSTRAR RESULTADOS POR CONSOLA
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(suma);
        System.out.println(division);
        System.out.println(banderados);
        */
        
        //ESCRITURA EN JAVA
        
        int num4 = 10;
        
        //MOSTRAR UN MENSAJE O VARIABLE EN "PANTALLA" (OUTPUT) 
        System.out.println(num4);
        
        //MOSTRAR MENSAJE + VARIABLE
        System.out.println("La variable posee el valor " + num4);
        
        //MOSTRAR EL MENSAJE SIN SALTOS DE LINEA
        System.out.print("Hola");
        System.out.print("mundo");
        
        /*EJERCICIO 4
Define una variable que aloje tu nombre y otra que guarde tu edad. Imprime ambas variables por
pantalla.*/
        
        String nombres = "Emanuel Ledesma";
        int edad = 29;
        
        System.out.println("Hola mi nombre es " + nombres + " y tengo " + edad + " años.");
        
        /*Recomendamos que hagan el siguiente experimento: tipear en
minúsculas la palabra sout y apenas terminamos de escribirla tocar el
botón tab o mejor dicho tabular.
Esto nos va a generar un System.out.println() para poder escribir lo que
queramos.*/
        
        
    }
    
}
