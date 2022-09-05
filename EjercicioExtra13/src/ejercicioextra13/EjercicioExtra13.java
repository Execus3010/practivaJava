/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra13;

import java.util.Scanner;

/**
 *
 * @author Emanuel
 */
public class EjercicioExtra13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // EJERCICIO EXTRA 13:
        /*Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123*/
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");//EL USUARIO INGRESA EL TAMAÑO DE LA ESCALERA
        int num = leer.nextInt();
        int cont = 1; //SE INICIALIZA UN CONTADOR
        
        for (int i = 1; i <= num; i++) {//BUBLE FOR PARA CICLAR
         
            System.out.print(i+" ");//IMPRIMIMOS NUESTRO NUMERO
            
            if (cont==i) {//CONDICION PARA REINICIAR EL CICLO
                System.out.println("");
                cont++;
                i=0;
                
            }
           
            if(cont == num+1){//CONDICION PARA ROMPER EL CICLO Y EVITAR UNA LINEA FINAL DOBLE
                break;
            }
           
            
        }
        
    }
    
}
