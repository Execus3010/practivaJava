/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra6;

import java.util.Scanner;

/**
 *
 * @author Emanuel
 */
public class EjercicioExtra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio Extra 6:
        /*Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.*/
        
        Scanner leer = new Scanner(System.in);
        double mayorPromedio=0;
        double menorPromedio=0.0;
        System.out.println("Ingrese el numero de personas en total por favor");
        int numPersonas = leer.nextInt();
        for (int i = 0; i < numPersonas; i++) {
            System.out.println("Ingrese la estatura de la "+ (i + 1) + "° persona" );
            double estaturas = leer.nextDouble();
                    if (estaturas>=1.60) {
               mayorPromedio++;
            }else{
                menorPromedio++;
            }
        }
            
        System.out.println("El promedio de personas con estatura mayor a 1.60mts es :" + (numPersonas/mayorPromedio));
         System.out.println("El promedio de personas con estatura menor a 1.60mts es :" + (numPersonas/menorPromedio));
    }
    
}
