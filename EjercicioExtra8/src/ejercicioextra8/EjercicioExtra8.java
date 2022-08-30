/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra8;

import java.util.Scanner;

/**
 *
 * @author Emanuel
 */
public class EjercicioExtra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EJERCICIO EXTRA 8:
        /*Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.*/
        
        Scanner leer = new Scanner(System.in);
       int numUsuario, cantNumeros=0, numPares=0, numImpares=0;
       
        System.out.println("Ingrese sus numeros");
        do {
            
           //USUARIO INGRESA NUMEROS != MULTIPLO DE 5
         numUsuario = leer.nextInt();
         
         
            if (numUsuario>0 && numUsuario%2==0) {
                //CONTADOR DE PARES
                numPares++;                
            }else if(numUsuario>0 && numUsuario%2!=0){
                //CONTADOR DE IMPARES
                numImpares++;
            }else if(numUsuario<0){
                //SOLO NUMEROS POSITIVOS
                System.out.println("Ingrese solo numeros positivos por favor");
                cantNumeros--;
            }
           
         cantNumeros++; //CONTADOR DE NUMEROS INGRESADOS
         
        } while(numUsuario%5!=0);//HASTA INGRESAR UN MULTIPLO DE 5
        
        System.out.println("La cantidad de numeros ingresados fue :" + cantNumeros);
        System.out.println("De esos numeros " + numPares + " son pares");
        System.out.println("Y " + numImpares + " son impares");
        
    }
    
}
