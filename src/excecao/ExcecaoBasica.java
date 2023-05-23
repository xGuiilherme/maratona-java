package excecao;

import streams.Reduce.AlunoReduce;
import streams.filter.Aluno;

public class ExcecaoBasica {

    public static void main(String[] args) {

        AlunoReduce aluno = null;

        try {
            imprimirNomeDoAluno(aluno);
        } catch (Exception ex) {
            System.out.println("Ocorreu um erro no momento de imprimir");
        }

        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu o erro: " + e.getMessage());
        }

        System.out.println("Fim :)");
    }

    public static void imprimirNomeDoAluno(AlunoReduce aluno) {
        System.out.println(aluno.nome);
    }
}
