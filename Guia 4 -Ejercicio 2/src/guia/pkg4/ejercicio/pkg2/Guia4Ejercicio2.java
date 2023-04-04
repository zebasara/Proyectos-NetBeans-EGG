/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg4.ejercicio.pkg2;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Guia4Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        String opcion;
        boolean c = true;
        String s,n;
        
        do{
        System.out.println("Ingrese nombre");
        String nombre = teclado.next();
        System.out.println("Ingrese edad");
        int edad = teclado.nextInt();
        mostrarInfo(nombre, edad);
        System.out.println("Quiere seguir ingresando personas? s/n");
        opcion = teclado.next();
        
        if (opcion.equalsIgnoreCase("s")){
            c = true;
        }else{
            c = false;
        }
            
        }while(c == true);
        System.out.println("Gracias por utilizar nuestros servicios! =)");
        
    }
    public static void mostrarInfo(String nombre, int edad){
        if (edad >= 18){
            System.out.println("Persona de nombre: "+nombre+", edad: "+edad);
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Persona de nombre: "+nombre+", edad: "+edad);
            System.out.println("Es menor de edad");
        }
    }
}
