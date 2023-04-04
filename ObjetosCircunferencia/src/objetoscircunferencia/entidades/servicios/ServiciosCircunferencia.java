/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetoscircunferencia.entidades.servicios;

import java.util.Scanner;
import objetoscircunferencia.entidades.Circunferencia;

/**
 *
 * @author HP
 */
public class ServiciosCircunferencia {
    private Scanner teclado = new Scanner(System.in);
     public Circunferencia crearCircunferencia(){
        Circunferencia c1 = new Circunferencia();
        
        System.out.println("Ingrese el radio: ");
        double radio = teclado.nextDouble();
        return new Circunferencia();
    }
      
}
