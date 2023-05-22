package lambdas.functionalinterface.function;

import java.util.function.Function;

// Define o tipo de parâmetro que você quer passar e o tipo de retorno que essa função vai retornar.

public class Funcao {

    public static void main(String[] args) {

        // Função que defini se um número é 'par' ou 'impar', entra um valor 'inteiro' e sai um valor 'string'.
        Function<Integer, String> parOuImpar =
                numero -> numero % 2 == 0 ? "Par" : "Impar";

        // Essa função vai fazer apenas concatenar o início da String junto com a String original que foi gerada.
        Function<String, String> oResultadoE =
                valor -> "O resultado é: " + valor;

        Function<String, String> empolgado =
                valor -> valor + "!";

        // No caso ele entra um Inteiro e sai uma String e na segunda função ele entra/sai uma String não tem problema em concatenar uma função depois da outra.
        String resultadoFinal = parOuImpar
                .andThen(oResultadoE)
                .andThen(empolgado)
                .apply(32);

        System.out.println(resultadoFinal);
        System.out.println(parOuImpar.apply(33));
    }
}
