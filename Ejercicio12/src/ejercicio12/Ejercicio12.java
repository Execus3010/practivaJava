/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author Emanuel
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // EJERCICIO 12
        /*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().*/
        Scanner leer = new Scanner(System.in);
        int correctas=0;
        int incorrectas=0;
        String palabra;
        String fde = "&&&&&";
        
        
        
            do{
                 System.out.println("Ingrese una frase de no mas de 5 caracteres que comienze con la eltra <x> y termine con la letra <o>");
            System.out.println("Ingrese <&&&&&> para terminar");
            palabra = leer.nextLine();
           
           
            int caracteres = palabra.length();
            
            if(palabra.substring(0,1).equals("x") && palabra.substring(caracteres-1).equals("o") && caracteres <= 5){
                correctas++;
                
            }else if (palabra.equals(fde)){
                break;
                    }else{
                incorrectas++;
            }
                   
        }  while(!palabra.equals(fde));
            
        System.out.println("La cantidad de palabras correctamente ingresedas es: "+ correctas);
        System.out.println("La cantidad de palabras ingresedas incorrectamente es: "+ incorrectas);
    }
    
}
