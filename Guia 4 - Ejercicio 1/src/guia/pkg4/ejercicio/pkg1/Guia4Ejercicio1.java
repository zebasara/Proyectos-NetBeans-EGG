/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg4.ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Guia4Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
       
        System.out.println("Ingrese su primer numero");
        int valor1= teclado.nextInt();
        System.out.println("Ingrese su segundo numero");
        int valor2= teclado.nextInt();
        System.out.println("Ingrese 1 para sumar, 2 para multiplicar, 3 para resta y 4 para dividir");
        int opcion = teclado.nextInt();
        
        switch (opcion){
            
            case 1:              
                int s = suma(valor1,valor2);
                System.out.println("La suma de sus numeros: "+s);
                break;
            case 2:
                int m = multiplicacion(valor1,valor2);
                System.out.println("La multiplicacion de sus numeros: "+m);
                break;
            case 3: 
                int r = resta(valor1,valor2);
                System.out.println("La resta de sus numeros: "+r);
                break;
            case 4:
                int d = dividir(valor1,valor2);
                System.out.println("La division de sus numeros: "+d);
                break;
                
            default:
                System.out.println("El valor ingresado no es valido,vuelva a intentarlo!");
                
                break;
            }
       
                
        
        
    }
    public static int suma(int a,int b){
        // logica
        int r = a + b;
        return r;
    }
    public static int multiplicacion (int a,int b){
        int r = a * b;
        return r;
   
}
    public static int resta(int a,int b){
        int r = a - b;
        return r;
    }  
    public static int dividir(int a,int b){
        int r = a / b;
        return r;
    }
    
    
}
