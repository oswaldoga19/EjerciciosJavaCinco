/*
Dado el radio de un círculo. Haga un algoritmo que obtenga el área del círculo y la longitud de la circunferencia.
*/
package ejerciciosjavacinco;

import java.util.Scanner;

public class EjerciciosJavaCinco {

    public static void main(String[] args) {
        // Creaando un objeto Scanner para leer el numero del usuario
        Scanner scanner = new Scanner(System.in);

        // Definición de variables
        double radio;

        // Entrada de datos
        System.out.print("Por favor ingrese el radio del círculo para sacar el area y longitud: ");
        radio = scanner.nextDouble();

        // Formula para calcular el área del círculo
        double area = Math.PI * Math.pow(radio, 2);

        // Formula paara calcular la longitud de la circunferencia
        double circunferencia = 2 * Math.PI * radio;

        // Mostrar resultados
        System.out.println("El área del círculo es: " + area);
        System.out.println("La longitud de la circunferencia es: " + circunferencia);
    }
    
}
