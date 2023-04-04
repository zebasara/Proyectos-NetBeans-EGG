/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg4.ejercicio.pkg3;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Guia4Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double cant;
        
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de EUROS que desea convertir");
        double euros=teclado.nextFloat();
        System.out.println("Elija 'l' para convertir a Libras, 'd' para convertir a Dolares, e 'y' para convertir a Yenes");
        String moneda=teclado.next();
       
        switch (moneda){
            case "l":case "L":
                convertirMoneda(euros, moneda);
                break;
            case "d":case "D":
                convertirMoneda(euros, moneda);
                break;
            case "y":case "Y":
                convertirMoneda(euros, moneda);
                break;
            default:
                System.out.println("Opcion invalida, vuelva a intentarlo.");
                break;
        
        }
        
    }
    //ACA MIS FUNCIONES
    public static void convertirMoneda(double euros,String moneda){
        //double libras= 0.86;
        if(moneda.equalsIgnoreCase("l")){
             double cant=(euros * 0.86);
             System.out.println("Conversion de EUROS a LIBRAS: "+cant);
        }
        if(moneda.equalsIgnoreCase("d")){
             double cant=(euros * 1.28611);
             System.out.println("Conversion de EUROS a DOLARES: "+cant);
        }
        if(moneda.equalsIgnoreCase("y")){
             double cant=(euros * 129.852);
             System.out.println("Conversion de EUROS a YENES: "+cant);
        }    
    }
    
    
}
/* El cambio de divisas es:
   * 0.86 libras es un 1 €
   * 1.28611 $ es un 1 €
   * 129.852 yenes es un 1 €
*/