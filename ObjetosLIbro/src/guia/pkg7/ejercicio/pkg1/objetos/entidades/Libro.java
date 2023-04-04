/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg7.ejercicio.pkg1.objetos.entidades;

/**
 *
 * @author HP
 */
public class Libro {
    
    public int ISBN;
    public String titulo;
    public String autor;
    public int numeroDePaginas;
    
    public Libro(){
        
    }

    public Libro(int ISBN, String titulo, String autor, int numeroDePaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }
    
    
        
 }
    
    
    
    
    
