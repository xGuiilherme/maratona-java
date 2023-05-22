package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Lu", "Gui", "Ana", "Luca");

        System.out.println("Usando for tradicional...");
        for (int i = 0; i < aprovados.size(); i++) {
            System.out.println(aprovados.get(i));
        }

        System.out.println("\nUsando foreach...");
        for (String nome : aprovados) {
            System.out.println(nome);
        }

        // Iterator: Ele tem dois métodos retorna verdadeiro/false e tem um elemento proximo se nao tiver ele sai do laço.
        System.out.println("\nUsando Iterator...");
        Iterator<String> iterator = aprovados.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Stream é um conjunto de objetos, ela ocorre de forma interna sem precisar codificar.
        System.out.println("\nUsando Stream...");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println); // Laço interno!
    }
}
