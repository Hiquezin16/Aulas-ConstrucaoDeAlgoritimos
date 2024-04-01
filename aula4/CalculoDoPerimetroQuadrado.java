package aula4;

import java.util.Scanner;

public class CalculoDoPerimetroQuadrado {
  public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // obtendo o lado do quadrado 

        System.out.println("digite o valor do lado do quadrado");
        double lado = scanner.nextDouble();
        
        // calculando o perimetro do quadrado 
        
        double perimetro = 4 * lado; 

        System.out.println("o perimetro do quadrado de lado " + lado + " é "
        + perimetro);

        scanner.close();
    }
}