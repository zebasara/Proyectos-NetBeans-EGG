/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg2.ejercicio.pkg5;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Guia2Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int num = leer.nextInt();
        System.out.println("El doble de su numero: " + (num * 2));
        System.out.println("El triple de su numero: " + (num * 3));
        System.out.println("La raiz cuadrada de su numero: " + (Math.sqrt(num)));
        
    }
    
}
