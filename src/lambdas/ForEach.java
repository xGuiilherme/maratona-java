package lambdas;

import java.util.Arrays;
import java.util.List;

public class ForEach {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

        // Forma tradicional para percorrer os nomes.
        System.out.println("Forma tradicional...");
        for (String nome : aprovados) {
            System.out.println(nome);
        }

        // Tendo apenas um único parameto não precisa colocar dentro de (), tendo uma única sentença de código pode remover o par de chaves {}.
        System.out.println("\nLambda #01...");
        aprovados.forEach(nome -> System.out.println(nome + "!!!"));

        // Passa uma referencia para função.
        System.out.println("\nMethod Reference #01...");

        System.out.println("\nLambda #02...");
        aprovados.forEach(nome -> meuImprimir(nome));
        aprovados.forEach(System.out::println);

        // Passa uma referencia para uma função que eu criei.
        System.out.println("\nMethod Reference #02...");
        aprovados.forEach(ForEach::meuImprimir);
    }

    static void meuImprimir(String nome) {
        System.out.println("Oi! Meu nome é " + nome);
    }
}
