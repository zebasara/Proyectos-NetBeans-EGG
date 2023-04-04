/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg5.ejercicio.pkg3;

import java.util.Random;
import sun.security.util.Length;

/**
 *
 * @author HP
 */
public class Guia5Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Recorrer un vector de N enteros contabilizando cuántos 
        números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
        */
        Random aleatorio = new Random(100);
        int vector[] = new int [9000];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = aleatorio.nextInt(11456);
        }
        
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        
        System.out.println("---------------");
        int c1=0;
        int c2=0;
        int c3=0;
        int c4=0;
        int c5=0;
        
        for (int i = 0; i < vector.length; i++) {
            if(vector[i] < 10){
                c1++;
            }
            if(vector[i] > 9 && vector[i] < 100){
                c2++;
            }
            if(vector[i] > 99 && vector[i] < 1000){
                c3++;
            }
            if(vector[i] > 999 && vector[i] < 10000){
                c4++;
            }
            if(vector[i] > 9999 && vector[i] < 100000){
                c5++;
            }
        }
         System.out.println("De 1 digito :" + c1);
         System.out.println("De 2 digitos :" + c2);
         System.out.println("De 3 digitos :" + c3);
         System.out.println("De 4 digitos :" + c4);
         System.out.println("De 5 digitos :" + c5);
 }
     
}
