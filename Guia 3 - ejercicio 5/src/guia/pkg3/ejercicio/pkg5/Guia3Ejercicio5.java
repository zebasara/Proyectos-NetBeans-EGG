/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg3.ejercicio.pkg5;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Guia3Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           int valor,suma,num;
        suma=0;
        System.out.println("Ingrese el valor limite");
        Scanner leer = new Scanner(System.in);
        valor=leer.nextInt();
        
        do{
            System.out.println("Ingrese numeros a sumar");
            num=leer.nextInt();
            suma+=num;
            System.out.println("suma: "+suma);
        }while(suma<valor);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
