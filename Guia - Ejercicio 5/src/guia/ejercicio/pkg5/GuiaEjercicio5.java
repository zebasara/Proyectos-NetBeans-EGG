/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.ejercicio.pkg5;



/**
 *
 * @author HP
 */
public class GuiaEjercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realice un programa que compruebe si una matriz dada es antisimétrica. 
        Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, pero 
        cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz traspuesta de una matriz A se 
        denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
        */
        int matriz[][]= {
            {0,-2,4},
            {2,0,2},
            {-4,-2,0}   
        };
        int matrizTransp [][] = new int [3][3];
       
                
        boolean iguales = true;
        // matriz
        System.out.println("Matriz antisimetrica:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("|" + matriz[i][j] + "|");
            }
            System.out.println(" ");
        }
        // matriz transpuesta
        System.out.println("----------------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizTransp[i][j] = matriz [j][i];
            }
        }
        
        System.out.println("Matriz antisimetrica:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("|" + matrizTransp[i][j] + "|");
            }
            System.out.println(" ");
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            if (matriz[i][j] != -matrizTransp[i][j]){
            iguales = false;
            break;
            }
        }
        }  
        if(iguales){
            System.out.println("Las matrices son antisimetricas!");
            }else 
            System.out.println("Las matrices no son antisimetricas =("); 
            
    }
}

    
 
