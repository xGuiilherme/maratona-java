package lambdas.functionalinterface.consumer;

public class Produto {

    public final String nome;
    public final double preco;
    public final double desconto;

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        double precoFinal = preco * (1 - desconto);
        return "Produto: " + "nome = " + nome +
                ", preco = " + preco + ", desconto = "
                + desconto + ", Preço Final Com Desconto: " + precoFinal;
    }
}
