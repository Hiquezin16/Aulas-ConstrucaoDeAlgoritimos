package aula4;

import java.util.Scanner;

public class CalculoDoPerimetroRetangulo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // obtendo a base e altura do retangulo 

        System.out.println("digite a altura do retangulo ");
        double altura = scanner.nextDouble();

        System.out.println("digite a base do retangulo ");
        double base = scanner.nextDouble();

        // calculo do perimetro do retangulo (2.b) + (2.h)

        double perimetro = (2 * altura) + (2 * base);
        
        System.out.println("o perimetro do retangulo de base " + base + " e altura " + altura + " é " + perimetro);

        scanner.close();
    }    
}
