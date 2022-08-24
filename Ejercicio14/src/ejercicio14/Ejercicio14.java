/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author Emanuel
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // EJERCICIO 14
        /*Crea una aplicación que a través de una función nos convierta una cantidad de euros
        introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
        función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
        una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
        (void).
        El cambio de divisas es:
        * 0.86 libras es un 1 €
        * 1.28611 $ es un 1 €
        * 129.852 yenes es un 1 €*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de Euros");
        int euros = leer.nextInt();
        System.out.println("Ingrese la moneda a la cual desea convertir");
        String moneda = leer.next();
        
        
        conversorMoneda(moneda,euros);

    }
    
    public static void conversorMoneda(String moneda,int euros){
        
        switch(moneda){
            case "libras":
                System.out.println("La conversión es " + (euros * 0.86) + " Libras");
                break;
            case "dolares":
                System.out.println("La conversión es " + (euros * 1.28611) + " Dolares");
                break;
            case "yen":
                System.out.println("La conversión es " + (euros * 129.852) + " Yenes");
                break;
        }
    }

}
