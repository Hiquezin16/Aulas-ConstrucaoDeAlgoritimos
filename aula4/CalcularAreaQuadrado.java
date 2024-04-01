package aula4;

import java.util.Scanner;

public class CalcularAreaQuadrado {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // obtendo o lado do quadrado 

        System.out.println("digite o valor do lado do quadrado");
        double lado = scanner.nextDouble();

        // calculando a area do quadrado 

        double area = lado * lado; 

        System.out.println("a area do quadrado de lado " + lado + " é " + area);

        scanner.close();
    }
}
