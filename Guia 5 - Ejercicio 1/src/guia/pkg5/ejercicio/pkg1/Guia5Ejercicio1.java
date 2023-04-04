/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg5.ejercicio.pkg1;



/**
 *
 * @author HP
 */
public class Guia5Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un algoritmo que llene un vector con los 100 primeros números 
          enteros y los muestre por pantalla en orden descendente.*/
        
        int vector [] = new int [100];
        
        
        for (int i = 0; i < vector.length; i++) {
            vector [i]= i;
        }
            System.out.println("Se muestra el vector en forma descendente:");
        for (int i = vector.length-1 ; i > 0; i--) {
       
            System.out.print("[" + vector[i] + "]");
            
        }
        
        
        
        
    }
    
}
