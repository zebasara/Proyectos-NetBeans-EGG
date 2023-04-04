/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg3.ejercicio.pkg3;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Guia3Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        do{
        System.out.println("Ingrese una frase");
        frase = leer.next();
        if(frase.length() == 8){
            System.out.println("CORRECTO");
        }
        else{
            System.out.println("INCORRECTO");
        }
        }while(frase.length() < 8 || frase.length() > 8);
        
        
        
        
        
        
        
        
      
    }
    
}
