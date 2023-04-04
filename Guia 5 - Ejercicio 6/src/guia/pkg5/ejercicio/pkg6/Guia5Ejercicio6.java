/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg5.ejercicio.pkg6;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Guia5Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números 
        del 1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
        Crear un programa que permita introducir un cuadrado por teclado y determine si este 
        cuadrado es mágico o no. El programa deberá comprobar que los números introducidos 
        son correctos, es decir, están entre el 1 y el 9.
        */
        Scanner teclado = new Scanner(System.in);
        int matriz[][] = new int [3][3];
        System.out.println("Ingrese los numeros de su matriz, (entre 1 y 9)");
 
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = teclado.nextInt();
            }
        }
        
        System.out.println("--------------------------------");
        System.out.println("Su matriz esta cargada!");
       
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("|" + matriz[i][j] + "|");
            }
            System.out.println(" ");
        }
        
        
        
    
    
    }
}
