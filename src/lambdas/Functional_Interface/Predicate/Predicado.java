package lambdas.Functional_Interface.Predicate;

import java.util.function.Predicate;

//TODO: Predicate recebe 1 unico parametro e retorna verdadeiro/falso.

public class Predicado {

    public static void main(String[] args) {

        // Defini se um tipo de produto é caro ou não.
        Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 750;

        Produto produto = new Produto("Notebook", 3850.87, 0.15);
        System.out.println(isCaro.test(produto));
    }
}
