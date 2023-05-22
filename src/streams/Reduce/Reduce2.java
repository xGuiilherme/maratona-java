package streams.Reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {

    public static void main(String[] args) {

        AlunoReduce a1 = new AlunoReduce("Ana", 7.1);
        AlunoReduce a2 = new AlunoReduce("Luna", 6.1);
        AlunoReduce a3 = new AlunoReduce("Gui", 8.1);
        AlunoReduce a4 = new AlunoReduce("Gabi", 10);

        List<AlunoReduce> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<AlunoReduce> aprovados = a -> a.nota >= 7;
        Function<AlunoReduce, Double> apenasNota = a -> a.nota;
        BinaryOperator<Double> somatoria = (a, b) -> a + b;

        alunos.stream()
                .filter(aprovados)
                .map(apenasNota)
                .reduce(somatoria)
                .ifPresent(System.out::println);
    }
}
