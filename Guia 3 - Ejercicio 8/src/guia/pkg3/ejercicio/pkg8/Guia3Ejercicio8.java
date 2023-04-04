/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg3.ejercicio.pkg8;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Guia3Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        Scanner leer = new Scanner(System.in);
        
        String matriz [] [] = new String [3] [3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i==0) {
                matriz [i][j] = "*"; 
                }
                else if (i==1 && j==0){
                matriz [i][j] = "*";
                }
                else if(i==1 && j==2){
                matriz [i][j] = "*";
                }
                else if (i==2){
                matriz [i][j] = "*";
                }   
            }
        }
            
            
            
        for (int x = 0; x < 3; x++) {
            for (int z = 0; z < 3; z++) {
          
                if (x==0){
                  System.out.print(matriz [x][z]);
                }
                else if (x==1 && z==0){
                  System.out.print(matriz [x][z]+ " ");
                }
                else if(x==1 && z==2){
                  System.out.print(matriz [x][z]);
                }
                else if (x==2){
                  System.out.print(matriz [x][z]);
                } 
                
            } 
             System.out.println();
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
