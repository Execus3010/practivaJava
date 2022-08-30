/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra5;

import java.util.Scanner;

/**
 *
 * @author Emanuel
 */
public class EjercicioExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // EJERCICIO EXTRA 5:
        /*Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.*/
        
        Scanner leer = new Scanner(System.in);
        
        
        
            System.out.println("Buen dia, digamos que tipo de asociado es por favor");
            System.out.println("A_Socio dorado \n"
                    + "B_Socio platino \n"
                    + "C_Socio bronce\n"
                    + "D_salir");
            String opcion = leer.nextLine().toUpperCase();
            
            switch(opcion){
                case "A":
                    System.out.println("Ingrese el monto total del tratamiento que requiere");
                    int monto = leer.nextInt();
                    System.out.println("El monto a pagar con el descuento aplicado sera de " +  (monto - monto*0.50));
                    break;
                case "B":
                     System.out.println("Ingrese el monto total del tratamiento que requiere");
                    monto = leer.nextInt();
                    System.out.println("El monto a pagar con el descuento aplicado sera de " + (monto - monto*0.35));
                    break;
                case "C":
                    System.out.println("Ingrese el monto total del tratamiento que requiere");
                    monto = leer.nextInt();
                    System.out.println("El monto a pagar con el descuento aplicado sera de " + monto);
                    break;
                
            }
            
            
       
    }
    
}
