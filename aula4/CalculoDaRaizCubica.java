package aula4;

import java.util.Scanner;

public class CalculoDaRaizCubica {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // encontrando o numero da raiz

        System.out.println("digite o numero que deseja saber a raiz cubica ");
        int numero = scanner.nextInt();

        // calculo da raiz 

        System.out.println("a raiz cúbica do número " + numero + " é " + Math.cbrt(numero) );

        scanner.close();
    }
}
