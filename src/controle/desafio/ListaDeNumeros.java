package controle.desafio;

import java.util.Arrays;
import java.util.List;

public class ListaDeNumeros {

    public static void main(String[] args) {

        // Desafio: Você tem uma lista de números. Você deseja imprimir o valor dos 7 primeiros, multiplicado por 2,
        // mas apenas se o número for par. Vejamos uma implementação possível com Java tradicional:

        List<Integer> lista = Arrays.asList(1, 5, 8, 7, 4, 6, 3, 2, 1, 8, 5, 7, 4);
        for (int i = 0; i < 7; i++) {
            Integer numero = lista.get(i);
            if (numero % 2 == 0) {
                System.out.println(numero * 2);
            }
        }
    }
}
