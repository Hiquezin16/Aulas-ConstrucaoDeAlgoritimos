package aula4;

import java.util.Scanner;

public class ConversaoCelciusFahrenheit {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        // obtendo o valor em celcius
        
        System.out.println("digite o valor em celsius para converter em fahrenheit");
        double celsius = scanner.nextInt();

        // convertendo celcius em fahrentheit

        double fahrenheit = celsius * 1.8 + 32;

        System.out.println(celsius +"°C em fahrenheit é " + fahrenheit + " °F ");

        scanner.close();
    }
}    