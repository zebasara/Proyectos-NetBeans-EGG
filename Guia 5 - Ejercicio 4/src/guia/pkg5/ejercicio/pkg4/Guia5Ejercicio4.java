/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg5.ejercicio.pkg4;

import java.util.Random;

/**
 *
 * @author HP
 */
public class Guia5Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realizar un programa que rellene un matriz de 4 x 4 de valores 
        aleatorios y muestre la traspuesta de la matriz. La matriz traspuesta de 
        una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
        */
        Random aleatorio = new Random();
        int matriz[][] = new int [4][4];
        int matrizTransp [][] = new int [4][4];
        // matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = aleatorio.nextInt(20);
            }
        }
        System.out.println("Matriz original:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
        // matriz transpuesta
        System.out.println("----------------------");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizTransp[i][j] = matriz [j][i];
            }
        }
        System.out.println("Matriz transpuesta:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + matrizTransp[i][j] + "]");
            }
            System.out.println(" ");
        }
        
    
        
    }
    
}
