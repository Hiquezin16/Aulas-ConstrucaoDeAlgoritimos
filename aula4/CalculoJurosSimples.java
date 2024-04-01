package aula4;

import java.util.Scanner;

public class CalculoJurosSimples {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // obtendo a taxa a o valor inicial 

        System.out.println("digite o valor inicial");
        double valor = scanner.nextDouble();

        System.out.println("digite o valor da taxa de juros em %");
        double taxa = scanner.nextDouble() / 100;  

        System.out.print("Digite o tempo em meses: ");
        int tempo = scanner.nextInt();

        // calculando o juros e o total 

        double juros = valor * taxa * tempo;
        double total = juros + valor;    

        System.out.println("O valor dos juros é R$" + juros + " em " + tempo + " meses ");
        System.out.println("o valor total é R$" + total);

        scanner.close();
    }
}