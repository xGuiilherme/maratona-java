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

        // Tento apenas um único parameto não precisa colocar dentro de (), tento uma única sentença de código pode remover o par de chaves {}.
        System.out.println("\nLambda #01...");
        aprovados.forEach((nome) -> {
            System.out.println(nome + "!!!");
        });

        // Passa uma referencia para essa função.
        System.out.println("\nMethod Reference...");
        aprovados.forEach(System.out::println);
    }
}
