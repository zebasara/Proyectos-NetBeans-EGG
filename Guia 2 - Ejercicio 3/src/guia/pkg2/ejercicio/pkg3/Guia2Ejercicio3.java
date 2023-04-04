/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg2.ejercicio.pkg3;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author HP
 */
public class Guia2Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.next();
        System.out.println("Su frase en Mayuscula");
        System.out.println(toUpperCase(frase));
        System.out.println("Su frase en Minuscula");
        System.out.println(toLowerCase(frase));
      
    }
    
}
