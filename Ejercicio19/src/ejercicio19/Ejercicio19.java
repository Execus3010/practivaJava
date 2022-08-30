/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19;

import java.util.Scanner;

/**
 *
 * @author Emanuel
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EJERCICIO 19:
        /*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus as por bs (o viceversa).*/
        Scanner leer = new Scanner(System.in);
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        boolean simetrica = true;
        
        /*
        a[0][0] = 1; a[0][1] = -2; a[0][2] =4;
        a[1][0] = 2; a[1][1] = 0; a[1][2] = 2;
        a[2][0] = -4; a[2][1] = -2; a[2][2] = 0;*/
        //DEFINIR A
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j]=(int)(Math.random()*9);
            }
        }
        //MOSTRAR A
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
            
        }       
        
        System.out.println("===========");
        
        //DEFINIR Y MOSTRAR B:        
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                b[i][j]=a[j][i];
                System.out.print(b[i][j]+" ");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] == b[i][j]) {
                    simetrica = true;
                }else{
                    simetrica=false;
                }
              
            }
        }
        if (simetrica==true) {
            System.out.println("Su matriz es simetrica");
            
        }else{
            System.out.println("Su matriz no es simetrica");
        }
        
        
        
    }
    
}
