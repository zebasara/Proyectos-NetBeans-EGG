/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg3.ejercicio.pkg4;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Guia3Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese una frase que empieze con A");
        Scanner leer = new Scanner(System.in);
        String frase = leer.next();
        
        if (frase.substring(0,1).equalsIgnoreCase("a")){
            System.out.println("CORRECTO");
        }
        else{
            System.out.println("INCORRECTO");
        }
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
