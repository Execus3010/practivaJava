/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra12;

/**
 *
 * @author Emanuel
 */
public class EjercicioExtra12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // EJERCICIO EXTRA 12:
        /*Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.*/
           
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    
                    
                     String numStringC = Integer.toString(i);
                     String numStringD = Integer.toString(j);
                     String numStringU = Integer.toString(k);
                    
                    if(numStringC.equals("3") && numStringD.equals("3")&&numStringU.equals("3")){
                         numStringC="E";
                         numStringD="E";
                         numStringU="E";   
                          
                        
                        
                    System.out.print(numStringC+"-");
                    System.out.print(numStringD+"-");
                    System.out.print(numStringU);
                    System.out.println(" ");
                        
                    }else if (numStringC.equals("3") && numStringD.equals("3")){ 
                     numStringC="E";
                     numStringD="E";
                         
                     System.out.print(numStringC+"-");
                    System.out.print(numStringD+"-");
                    System.out.print(k);
                    System.out.println(" ");   
                    
                }else if (numStringC.equals("3") && numStringU.equals("3")){ 
                     numStringC="E";
                     numStringU="E";
                         
                     System.out.print(numStringC+"-");
                    System.out.print(j+"-");
                    System.out.print(numStringU);
                    System.out.println(" ");   
                    
                }else if (numStringD.equals("3") && numStringU.equals("3")){ 
                     numStringD="E";
                     numStringU="E";
                         
                     System.out.print(i+"-");
                    System.out.print(numStringD+"-");
                    System.out.print(numStringU);
                    System.out.println(" ");   
                    
                }else if(numStringC.equals("3")) {
                      numStringC="E";
                                           
                     System.out.print(numStringC+"-");
                    System.out.print(j+"-");
                    System.out.print(k);
                    System.out.println(" ");
                    
                    
                
                    }else if (numStringD.equals("3")){
                    
                      numStringD="E";                     
                     
                     System.out.print(i+"-");
                    System.out.print(numStringD+"-");
                    System.out.print(k);
                    System.out.println(" ");
                    
                    
                    }else if (numStringU.equals("3")){
                    
                      numStringU="E";                     
                     
                     System.out.print(i+"-");
                    System.out.print(j+"-");
                    System.out.print(numStringU);
                    System.out.println(" ");
                        
                    }else{                
                 
                    System.out.print(i+"-");
                    System.out.print(j+"-");
                    System.out.print(k);
                    System.out.println(" ");
                    
                }
                
                
            }
            
        }
     }          
        
  }
} 
    

