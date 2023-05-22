package lambdas.functionalinterface.unaryoperator;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

    public static void main(String[] args) {

        // Operador binario que retornar um valor double.
        BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
        System.out.println(media.apply(9.8, 5.7));

        // Mais flexibilidade tipo do primeiro, segundo e o tipo do retono, alem de calcular a media ele transforma para um status.
        BiFunction<Double, Double, String> resultado = (n1, n2) -> ((n1 + n2) / 2) >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado.apply(9.7, 3.1));
        BiFunction<Double, Double, String> resultado1 = (n1, n2) -> {
            double notaFinal = (n1 + n2) / 2;
            return notaFinal >= 7 ? "Aprovado" : "Reprovado";
        };
        System.out.println(resultado1.apply(9.7, 5.1));

        // Composição de funções ou seja funções menores.
        Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(media.andThen(conceito).apply(9.7, 4.1));
    }
}
