/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo031 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int limite = 5;
        int contador = 1;
        double suma = 0;
        double valor_ingresado;
        double promedio = 0;
        
        while (contador <= limite) { 
            System.out.println("Ingrese el valor a sumar");
            valor_ingresado = entrada.nextDouble();
            suma = suma + valor_ingresado;
            System.out.printf("Valor ingresado %.2f\n", valor_ingresado);
            contador = contador + 1;
        }
        promedio = suma / limite;

        System.out.printf("La suma final es %.2f\nY el promedio finale es: "
                + "%.2f\n", suma, promedio);

    }
}
