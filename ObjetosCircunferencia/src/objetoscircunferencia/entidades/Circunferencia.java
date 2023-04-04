/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetoscircunferencia.entidades;

/**
 *
 * @author HP
 */
public class Circunferencia {
    
    private double radio;
    private double area;
    private double perimetro;
   
    //contructor vacio
    public Circunferencia(){
        
    }
    //contructor pasado por parametro
    public Circunferencia(double radio,double area,double perimetro){
        this.radio = radio;
        this.area = area;
        this.perimetro = perimetro;
    }
   

    public void setArea(double area) {
        this.area = area;
        System.out.println("El area de la circunferencia es: ");
        area = (Math.PI * radio) * (Math.PI * radio);
       
        
    }

    public void setPerimetro() {
        this.perimetro = perimetro;
        System.out.println("El perimetro de la circunferencia es: ");
        perimetro = 2 * Math.PI * radio;
        
        
    }
    
    
    
    
}
