package streams.Reduce;

import java.util.Objects;

public class AlunoReduce {

    public final String nome;
    public final double nota;
    public final boolean bomComportamento;

    public AlunoReduce(String nome, double nota) {
        this(nome, nota, true);
    }

    public AlunoReduce(String nome, double nota, boolean bomComportamento) {
        this.nome = nome;
        this.nota = nota;
        this.bomComportamento = bomComportamento;
    }

    public String toString() {
        return nome + " tem nota " + nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlunoReduce that = (AlunoReduce) o;
        return Double.compare(that.nota, nota) == 0 && bomComportamento == that.bomComportamento && Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nota, bomComportamento);
    }
}
