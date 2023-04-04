/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg7.ejercicio.pkg1.objetos.servicios;

import guia.pkg7.ejercicio.pkg1.objetos.entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ServicioLibro {
    private Scanner teclado = new Scanner(System.in).useDelimiter("\n");
    public Libro crearLibro(){
        Libro l1 = new Libro();
        
        System.out.println("Ingrese ISBN");
        int ISBN = teclado.nextInt();
        System.out.println("Ingrese titulo del libro");
        String titulo = teclado.next();
        System.out.println("Ingrese autor del libro");
        String autor = teclado.next();
        System.out.println("Ingrese numero de paginas");
        int numeroDePaginas = teclado.nextInt();
        
        return new Libro(ISBN,titulo,autor,numeroDePaginas);
    }
        
        
   
    
    
    
}
