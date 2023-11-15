package main.java.projetcs_java;

import java.util.Scanner;
import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        System.out.println("how much can you spend");
        Scanner scan = new Scanner(System.in);
        double total = scan.nextDouble();
        scan.nextLine();
        double sum = 0;
        double soma = 0.0;
        int i = 0;        
        ArrayList<Double> proportion = new ArrayList<Double>();
        ArrayList<Double> alimentos = new ArrayList<Double>();
        System.out.println("Enter your proportion of various expenses.");
        System.out.println("The system stops if cumulative proportion exceeds 100%");
        for (int k = 0; k < alimentos; k++) {
            System.out.println("Valor gasto em alimentos " + (i + 1) + ":");
            double valor = scan.nextDouble();
            alimentos.add(valor);
            soma += alimentos.get(i);

            if (soma > 100) {
                System.out.println("A soma ultrapassou 100%. Encerrando o loop.");
                break;
            }
        }

        // Exibir os valores inseridos
        System.out.println("Valores gastos em alimentos:");
        for (double valor : alimentos) {
            System.out.println(valor);
        }

        scanner.close();
        do {
            System.out.println("Your proportion of expense " +
                    (i + 1) + ":");
            double value = scan.nextDouble();
            proportion.add(value);
           sum+= poprtion    i++;} hile(um <

     
        .close();
        sum > 100) {
            le cumulativeSum = 0.0;
        f
            cumulativeSum += proportion.get(j);
                
         
           cumultveSum);
    
        
        (double value : proportion) {
     
         }
    }
}
