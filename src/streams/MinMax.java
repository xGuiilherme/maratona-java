package streams;

import streams.Reduce.AlunoReduce;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class MinMax {

    public static void main(String[] args) {

        AlunoReduce a1 = new AlunoReduce("Ana", 7.1);
        AlunoReduce a2 = new AlunoReduce("Luna", 6.1);
        AlunoReduce a3 = new AlunoReduce("Gui", 8.1);
        AlunoReduce a4 = new AlunoReduce("Gabi", 10);

        List<AlunoReduce> alunos = Arrays.asList(a1, a2, a3, a4);

        Comparator<AlunoReduce> melhorNota = (anulo1, aluno2) -> {

            if (anulo1.nota > aluno2.nota) return 1;
            if (anulo1.nota < aluno2.nota) return -1;
            return 0;
        };

        Comparator<AlunoReduce> piorNota = (anulo1, aluno2) -> {

            if (anulo1.nota > aluno2.nota) return -1;
            if (anulo1.nota < aluno2.nota) return 1;
            return 0;
        };

        System.out.println(alunos.stream().max(melhorNota).get());
        System.out.println(alunos.stream().min(piorNota).get());

        System.out.println(alunos.stream().min(melhorNota).get());
        System.out.println(alunos.stream().max(piorNota).get());
    }
}
