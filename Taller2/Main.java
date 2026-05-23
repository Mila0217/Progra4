package Taller2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Crear el Scanner
        Scanner sc = new Scanner(System.in);

        // Pedir los números
        System.out.print("Ingrese el primer número: ");
        double a = sc.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double b = sc.nextDouble();

        // Crear el objeto Calculadora
        Calculadora calc = new Calculadora(a, b);

        // Mostrar resultados
        System.out.println("Multiplicación: " + calc.multiplicar());
        System.out.println("División: " + calc.dividir());

        // Cerrar el Scanner
        sc.close();
    }
}
