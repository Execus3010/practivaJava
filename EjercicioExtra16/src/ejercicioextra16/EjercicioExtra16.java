/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra16;

import java.util.Scanner;

/**
 *
 * @author Emanuel
 */
public class EjercicioExtra16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // EJERCICIO EXTRA 16:
        /*Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.*/
        
        Scanner leer = new Scanner(System.in);
        
        
    }
    
    public static int personas(int N){
        Scanner leer = new Scanner(System.in);
        String res = "si";
        do {
            
        
        
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese el nombre y la edad de su "+i+"° persona");
            String nombre = leer.next();
            int edad = leer.nextInt();
            System.out.println("El nombre de su "+i+"° persona es "+nombre+ " y tiene "+edad+" años");
            if (edad>18) {
                System.out.println(nombre+" es mayor de edad");
            }else{
                System.out.println(nombre+" es menor de edad");
            }
            System.out.println("Desea mostrar ingresar otra persona?");
            
                        
        }
        } while (res.equals("si"));
        
    }
    
}
