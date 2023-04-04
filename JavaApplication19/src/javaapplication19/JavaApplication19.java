/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

/**
 *
 * @author HP
 */
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
es un quilombo pae
jajaja
System.out.println("BIENVENIDO A CONTINUACION AGREGUE 2 NUMEROS ");
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));

        int num2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));

        int opcion = 0;

        do {
            opcion = Byte.parseByte(JOptionPane.showInputDialog(
                    "***OPERACION A REALIZAR***\n"
                    + "1. SUMA\n"
                    + "2. RESTA\n"
                    + "3. MULTIPLICACION\n"
                    + "4. DIVISION\n"
                    + "5. SALIR\n"
                    + "ELIJA SU OPCION :)"));
           float resultado;
            switch (opcion) {
                case 1:

                    resultado = suma(num1, num2);
                    JOptionPane.showMessageDialog(null, "Resultado " + resultado);
                    break;
                case 2:
                    resultado = resta(num1, num2);
                    JOptionPane.showMessageDialog(null, "Resultado " + resultado);

                    break;
                case 3:
                    resultado = multi(num1, num2);
                    JOptionPane.showMessageDialog(null, "Resultado " + resultado);

                    break;
                case 4:
                    resultado = division(num1, num2);
                    JOptionPane.showMessageDialog(null, "Resultado " + resultado*100);


                    break;
                case 5:
                    opcion = 5;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion Invalida");
                    break;

            }

        } while (opcion != 5);
        System.exit(0);

    }