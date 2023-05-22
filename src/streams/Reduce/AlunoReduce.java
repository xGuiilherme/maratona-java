package streams.Reduce;

public class AlunoReduce {

    final String nome;
    final double nota;
    final boolean bomComportamento;

    public AlunoReduce(String nome, double nota) {
        this(nome, nota, true);
    }

    public AlunoReduce(String nome, double nota, boolean bomComportamento) {
        this.nome = nome;
        this.nota = nota;
        this.bomComportamento = bomComportamento;
    }
}
