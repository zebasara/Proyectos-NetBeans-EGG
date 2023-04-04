/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg5.ejercicio.pkg2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Guia5Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario 
        un número a buscar en el vector. El programa mostrará dónde se encuentra el numero y si se encuentra repetido
        */
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random(100);
        int vector[] = new int [30];
         for (int i = 0; i < vector.length; i++) {
            vector[i] = aleatorio.nextInt(80);
        }
        System.out.println("Se muestra el vector cargado con los numeros aleatorios:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
        System.out.println("Ingrese el numero a buscar en el vector:");
        int num = teclado.nextInt();
        int c=0;
        for (int i = 0; i < vector.length; i++) {
            if (num == vector[i]) {
              c++;  
                System.out.println("El numero se encuentra repetido " +c+ " vez/veces");
                System.out.println("Posicion:" + "[" + (i+1) + "]");
            }
        }
        
  
    }
    
}
