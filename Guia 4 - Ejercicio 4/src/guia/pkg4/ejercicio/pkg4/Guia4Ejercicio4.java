/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg4.ejercicio.pkg4;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Guia4Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese un numero");
        System.out.println("Devolvera TRUE si es primo y FALSE si no es primo");
        int num = teclado.nextInt();
        primoNoprimo(num);
    }
    public static void primoNoprimo(int num){
        int cont=0;
        for (int i = 2; i < 100; i++) {
            if (num%i==0){
            cont++;
            }
        }
        boolean r;
        if (cont<2){ 
        r=true;
        System.out.println(r);
        }else{
        r=false;
        System.out.println(r);
        }

    
    }      
}

