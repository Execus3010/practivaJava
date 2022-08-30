/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra7;

import java.util.Scanner;

/**
 *
 * @author Emanuel
 */
public class EjercicioExtra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio Extra 7:
        /*Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.*/
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int n = leer.nextInt();        
        int i = 0, numMayor=0, numMenor=1000, promedio=0,sum=0;
        
        //Ejercicio con WHILE
        /*
        
        while (i<n){
            System.out.println("Introduzca numeros");
            int m = leer.nextInt();
            sum=sum+m;
            
            if(m>=numMayor){ 
            numMayor=m;            
        }
            if(m<numMenor) {
        numMenor=m;
    }
            promedio++;
            i++;
        
 }*/
        //Ejercicio con DO/WHILE
        do{
            
            System.out.println("Introduzca numeros");
            int m = leer.nextInt();
            sum=sum+m;
            
            if(m>=numMayor){ 
            numMayor=m;            
        }
            if(m<numMenor) {
        numMenor=m;
    }
            promedio++;
            i++;
        
 
        }while(i!=n);
        
        System.out.println("El numero mas grande de todos los ingresados es :" + numMayor);
        System.out.println("El numero mas chico de todos los ingresados es :" + numMenor);
        System.out.println("El promedio de todos los numeros inresados es "+ (sum/promedio));

    
}
}
