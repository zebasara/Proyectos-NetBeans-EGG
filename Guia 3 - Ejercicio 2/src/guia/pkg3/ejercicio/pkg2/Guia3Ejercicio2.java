/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg3.ejercicio.pkg2;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Guia3Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese su frase:");
    String frase = leer.next();
    if(frase.equalsIgnoreCase("eureka")){
        System.out.println("CORRECTO");
    }
    else{
        System.out.println("INCORRECTO");
    }
        
        
        
        
        
        
        
    }
    
}
