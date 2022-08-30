/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra9;

import java.util.Scanner;

/**
 *
 * @author Emanuel
 */
public class EjercicioExtra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EJERCICIO EXTRA 9:    
    /*Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.*/
    
    Scanner leer = new Scanner(System.in);
    int num1, num2, cociente=1, residuo;
    
    
        System.out.println("Ingrese los numeros que desea restar");
        num1=leer.nextInt();
        num2=leer.nextInt();
        residuo=num1-num2;
        do {
            
            residuo=residuo-num2;
            cociente++;
        } while (residuo>num2);
        
        System.out.println("El residuo de su resta es: "+ residuo);
        System.out.println("El cociente de su resta es: " + cociente);
    
    }
    
}
