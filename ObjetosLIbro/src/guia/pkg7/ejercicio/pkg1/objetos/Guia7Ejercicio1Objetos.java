/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg7.ejercicio.pkg1.objetos;

import guia.pkg7.ejercicio.pkg1.objetos.entidades.Libro;
import guia.pkg7.ejercicio.pkg1.objetos.servicios.ServicioLibro;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Guia7Ejercicio1Objetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crear una clase llamada Libro que contenga los siguientes 
        atributos: ISBN, Título, Autor, Número de páginas, y un constructor 
        con todos los atributos pasados por parámetro y un constructor vacío. 
        Crear un método para cargar un libro pidiendo los datos al usuario 
        y luego informar mediante otro método el número de ISBN, el título, 
        el autor del libro y el número de páginas.
        
        */
        ServicioLibro  sl = new ServicioLibro();
        Libro l1 = sl.crearLibro();
        
        
        System.out.println("Datos de su Libro: ");
        System.out.println("ISBN: "+l1.ISBN +" Titulo: "+ l1.titulo +" Autor: "+ l1.autor +" Numero de paginas: "+ l1.numeroDePaginas);
        
        
       
    }
    
}
