/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg3.ejercicio.pkg7;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Guia3Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int correctas,incorrectas,cont;
        correctas=0;
        incorrectas=0;
        cont=0; 
        do{
         
            System.out.println("Ingrese la frase rs232:");
            String frase = leer.next();
               if (frase.equals("&&&&&") ) {
                cont+=1;
                break;
            }
            
               if(frase.length()<=5 && frase.substring(0,1).equals("x") && frase.substring(frase.length()-1,frase.length()).equals("o")){
                correctas+=1;
                System.out.println("frases encontradas correctas: " + correctas);
            }
               else if (frase.substring(0,1)!="x" || frase.substring(frase.length()-1)!= "o"){
                incorrectas+=1;
                System.out.println("frases encontradas incorrectas: " + incorrectas);
            }
       
        }while(cont == 0);
        System.out.println("Nos vemos");
        
        
        
    }
    
}
