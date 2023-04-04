/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg3.ejercicio.pkg6;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Guia3Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1,num2,opcion;
        boolean sesion;
        String letra;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        num1=sc.nextInt(); 
        System.out.println("Ingrese el segundo numero");
        num2=sc.nextInt();
        sesion=true;
        
        
        do{
            
            System.out.println("MENU");
            System.out.println("1.SUMAR");
            System.out.println("2.RESTAR");
            System.out.println("3.MULTIPLICAR");
            System.out.println("4.DIVIDIR");
            System.out.println("5.SALIR");
            System.out.println("ELIJA OPCION");
            opcion=sc.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("la suma es: " + (num1+num2));
                    break;
                case 2:
                    System.out.println("la resta es: " + (num1-num2));
                    break;
                case 3:
                    System.out.println("el producto es: " + (num1*num2));
                    break;
                case 4:
                    System.out.println("el cociente es: " + (num1/num2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    letra=sc.next();
                    if(letra.equalsIgnoreCase("S")) {
                     
                        sesion=false;
                    }
                    break;
                    
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
                
        }
        
       
    }while(sesion==true);
    System.out.println("ha cerrado sesion");
        
        
        
        
        
        
        
        
    }
    
}
