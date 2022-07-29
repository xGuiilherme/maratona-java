package arrays;

public class Foreach {

    public static void main(String[] args) {

        // ForEach = para cada elemento faça.. percorrer Array inteiro.
        double[] notas = {9.9, 8.7, 7.2, 9.4};

        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " ");
        }

        System.out.println();
        // Para cada repetição o valor de notas vai apontar para um elemento do Array.
        for (double nota : notas)
            System.out.print(nota + " ");
    }
}
