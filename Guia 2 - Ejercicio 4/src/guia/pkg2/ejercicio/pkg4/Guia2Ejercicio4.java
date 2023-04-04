/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg2.ejercicio.pkg4;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Guia2Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los grados centigrados");
        float num = leer.nextFloat();
        float f = 32 + (9 * num / 5);
        System.out.println("Sus grados centigrados: " + num + " En fahrenheit son: " + f);
        
    }
    
}
