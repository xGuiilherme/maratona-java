package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    final String nome;
    // Final sempre vai apontar p/ um edereço de memora nao pode alterar a referencia da constante,
    // O conteudo da lista é variavel pode tirar elemento, limpar etc.
    final List<Curso> cursos = new ArrayList<>();

    Aluno(String nome) {
        this.nome = nome;
    }

    // Retorno de um metodo é obrigatorio.
    void adicionarCurso(Curso curso) {
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    // Ele vai retornar o curso a partir do nome, esse metodo pode encontrar caso o nome do curso seja = o nome que passou
    Curso obterCursoPorNome(String nome) {
        for (Curso curso : this.cursos) {
            if (curso.nome.equalsIgnoreCase(nome)) {
                return curso;
            }
        }

        return null;
    }

    public String toString() {
        return nome;
    }
}
