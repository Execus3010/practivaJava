/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra10;

import java.util.Scanner;

/**
 *
 * @author Emanuel
 */
public class EjercicioExtra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // EJERCICIO EXTRA 10:
        /*Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.*/
        
        Scanner leer = new Scanner(System.in);
        int num1, numUsuario, cont=0;
        String res;
        num1 =(int)(Math.random()*10) * (int)(Math.random()*10);
        System.out.println(num1);
        System.out.println("Tienes que adivinar el numero, solo tendras tres intentos");
        
        do {
            numUsuario=leer.nextInt();
            cont++;
        } while ((numUsuario != num1) && (cont != 3));
        
        if (numUsuario==num1 && cont!=3) {
            System.out.println("Felicidades lo haz adivinado");
        }else{
            System.out.println("Se te han acabado los intentos");
        }
        
        System.out.println("hasta la proxima :D");
        
    }
    
}
