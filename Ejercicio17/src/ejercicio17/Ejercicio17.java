/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17;

/**
 *
 * @author Emanuel
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 17:
        /*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).*/
        int N = (int) (Math.random()*10); 
        int[] vec = new int[N];
          int dig1 = 0; int dig2 = 0; 
         int dig3 = 0; int dig4 = 0; int dig5=0;
         
        
        for (int i = 0; i < N; i++) {
            vec[i]= (int) (Math.random()*99999);
            System.out.println(vec[i]);
        }
        
        for (int i = 0; i < N; i++) {
          int longNumero = Integer.toString(vec[i]).length();
        
         
          switch(longNumero){
              case 1:
                  dig1++;
                  break;
              case 2 :
                 dig2++;
                  break;
              case 3 :
                 dig3++;
                  break;
              case 4 :
                 dig4++;
                  break;
              case 5 :
                 dig5++;
                  break;
          }
                    
           }
        
        System.out.println("La cantidad de numeros de un digito fue: " + dig1);
        System.out.println("La cantidad de numeros de dos digitos fue: " + dig2);
        System.out.println("La cantidad de numeros de tres digitos fue: " + dig3);
        System.out.println("La cantidad de numeros de cuatro digitos fue: " + dig4);
        System.out.println("La cantidad de numeros de cinco digitos fue: " + dig5);
        
    }

}
