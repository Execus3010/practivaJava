/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra23;

import java.util.Scanner;

/**
 *
 * @author Emanuel
 */
public class EjercicioExtra23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio Extra 23:
        /*Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().*/
       
        
        //INGRESAR UNA PALABRA ENTRE 3 Y 5 LETRAS
        Scanner leer = new Scanner(System.in);   
             System.out.println("Vamos a ingresar 5 palabras");
             do{
            System.out.println("Ingrese una palabra que tenga entre 3 y 5 letras");
            String palabra = leer.nextLine();
            
             //Guardar la longitud de mi palabra
           
             /*
            if (largoPalabra<3 || largoPalabra>5) {
                System.out.println("Ingrese su palabra nuevamente por favor");
                i=i-1;
                
            }
           */
             }while(cont<=5);
             
            String[][] sopaLetras = new String [20][20];
            
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    int filaR;
                    int columnaR=(int)(Math.random()*(largoPalabra-1));
                    
                    sopaLetras[j][columnaR]=;
                }
            }
            
       
        
    }
    
}
