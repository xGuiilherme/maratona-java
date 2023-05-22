package streams.Match;

import streams.Reduce.AlunoReduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

    public static void main(String[] args) {

        AlunoReduce a1 = new AlunoReduce("Ana", 7.1);
        AlunoReduce a2 = new AlunoReduce("Luna", 6.1);
        AlunoReduce a3 = new AlunoReduce("Gui", 8.1);
        AlunoReduce a4 = new AlunoReduce("Gabi", 10);

        List<AlunoReduce> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<AlunoReduce> aprovado = a -> a.nota >= 7;
        Predicate<AlunoReduce> reprovado = aprovado.negate();

        System.out.println(alunos.stream().allMatch(aprovado));
        System.out.println(alunos.stream().anyMatch(aprovado));
        System.out.println(alunos.stream().noneMatch(reprovado));
    }
}
