package lambdas.functionalinterface.desafio;

import lambdas.functionalinterface.consumer.Produto;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

    public static void main(String[] args) {

        /*
         * 1. A partir do Produto calcular o preço real (com desconto)
         * 2. Imposto Municipal: >=2500 (8.5%) / <2500 (Isento)
         * 3. Frete: >= 3000 (100) / < 3000(50)
         * 4. Arredondar: Deixar duas casa decimais
         * 5. Formatar: R$1234,56 - exemplo
         */

        Locale.setDefault(Locale.US);

        Produto p = new Produto("iPad", 3235.89, 0.0013);

        Function<Produto, Double> precoDesconto = produto -> produto.preco * (1 - produto.desconto);
        UnaryOperator<Double> impMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;
        UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
        UnaryOperator<Double> arredondar = preco -> Double.valueOf((String.format("%.2f", preco)));
        Function<Double, String> formatar = preco -> ("R$" + preco).replace(".", ",");

        String preco = precoDesconto
                .andThen(impMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p);
        System.out.println("O preço final é " + preco);
    }
}
