package streams.Outros;

import streams.Reduce.AlunoReduce;

import java.util.Arrays;
import java.util.List;

public class Outros {

    public static void main(String[] args) {

        AlunoReduce a1 = new AlunoReduce("Ana", 7.1);
        AlunoReduce a2 = new AlunoReduce("Luna", 6.1);
        AlunoReduce a3 = new AlunoReduce("Gui", 8.1);
        AlunoReduce a4 = new AlunoReduce("Gabi", 10);
        AlunoReduce a5 = new AlunoReduce("Ana", 7.1);
        AlunoReduce a6 = new AlunoReduce("Pedro", 6.1);
        AlunoReduce a7 = new AlunoReduce("Gui", 8.1);
        AlunoReduce a8 = new AlunoReduce("Maria", 10);

        List<AlunoReduce> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

        System.out.println("distinct...");
        alunos.stream().distinct().forEach(System.out::println);

        System.out.println("\nSkip/Limit");
        alunos.stream()
                .distinct()
                .skip(2)
                .limit(2)
                .forEach(System.out::println);

        System.out.println("\ntakeWhile");
        alunos.stream()
                .distinct()
                .skip(2)
                .takeWhile(a -> a.nota >= 7)
                .forEach(System.out::println);
    }
}
