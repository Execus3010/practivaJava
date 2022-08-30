/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra2;

/**
 *
 * @author Emanuel
 */
public class EjercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio Extra 2
        /*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.*/
        int a, b, c, d, aux;
        a=1; b=2; c=3; d=4; aux=0;
        System.out.println("Valores iniciales:"+"\n"+"A="+a+"\n"+"B="+ b+"\n"+"C="+c+"\n"+"D="+d);
        aux=b;
        b=c;
        c=a;
        a=d;
        d=aux;
        System.out.println("======");
         System.out.println("Valores intercambiados:"+"\n"+"A="+a+"\n"+"B="+ b+"\n"+"C="+c+"\n"+"D="+d);
        
    }
    
}
