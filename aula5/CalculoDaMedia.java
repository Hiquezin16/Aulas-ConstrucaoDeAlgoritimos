package aula5;

import java.util.Scanner;

public class CalculoDaMedia {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        // obtendo as notas das avaliacoes 
        
        System.out.println("digite sua nota da AC1 ");
        Double notaAC1 = 0.15*scanner.nextDouble();

        System.out.println("digite sua nota da AC2 ");
        Double notaAC2 = 0.30*scanner.nextDouble();

        System.out.println("digite sua nota da AG ");
        Double notaAG = 0.10*scanner.nextDouble();

        System.out.println("digite sua nota da AF ");
        Double notaAF = 0.45*scanner.nextDouble();

        // calculando a media final 
        
        Double mediaFinal = notaAC1 + notaAC2 + notaAF + notaAG;

        System.out.println("sua media final é " + mediaFinal);

        scanner.close();
    }    
}



