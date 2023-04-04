/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg2.ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
/**
 * 
 * @author HP
 */
public class Guia2Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        
        System.out.println("Ingrese dos numeros");
        System.out.println("Primer numero");
        num1 = leer.nextInt();
        System.out.println("Segundo numero");
        num2 = leer.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma de sus dos numeros es: " + suma );             
    }
    
}
