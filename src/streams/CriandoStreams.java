package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

    public static void main(String[] args) {

        Consumer<String> print = System.out::print;
        Consumer<Integer> println = System.out::println;

        // 1º forma que tem para criar uma Stream é o stream.of() a partir de uma interface.
        Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
        langs.forEach(print);

        // 2º forma criando uma stream a partir de um Array já com valores literais.
        String[] maisLangs = {"Python ", "Lisp ", "Perl ", "Go\n"};

        Stream.of(maisLangs).forEach(print);
        Arrays.stream(maisLangs).forEach(print);
        Arrays.stream(maisLangs, 1, 2).forEach(print);

        // Outra forma de gerar Stream é a partir das collections.
        List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
        outrasLangs.stream().forEach(print);
        outrasLangs.parallelStream().forEach(print);

        // Generate vai gear uma Stream infinita que nao tem ordenação e dentro do generate passa um lambda que sera o supplier é uma função que nao recebe parametro e retorna alguma coisa.
        Stream.generate(() -> "a").forEach(print);

        // Outra possibilidade para gerar Stream infinita utilizando o iterate() nesse caso já tem uma ordenação.
        Stream.iterate(0, n -> n + 1).forEach(println);
    }
}
