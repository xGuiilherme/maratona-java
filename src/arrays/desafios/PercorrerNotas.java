package arrays.desafios;

import java.util.Scanner;

public class PercorrerNotas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantas notas: ");
        int qtdeNotas = entrada.nextInt();

        double[] notas = new double[qtdeNotas];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Informe a nota " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
        }
        // Foreach pecorrer todos os elementos sem precisar de uma variavel para controlar o FOR.
        double total = 0;
        for (double nota : notas) {
            total += nota;
        }

        double media = total / notas.length;
        System.out.println("A media é " + media + "!");
        entrada.close();
    }
}
