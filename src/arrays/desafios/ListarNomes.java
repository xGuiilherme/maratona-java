package arrays.desafios;

import java.util.Arrays;
import java.util.List;

public class ListarNomes {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

        // Forma tradicional para percorrer os nomes.
        System.out.println("Forma tradicional...");
        for (String nome : aprovados) {
            System.out.println(nome);
        }
    }
}
