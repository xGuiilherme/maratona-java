package lambdas.Functional_Interface.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//TODO: Consumer aceita 1 unico parametro e não retorna nada.

public class Consumidor {

    public static void main(String[] args) {

        Consumer<Produto> imprimir = p -> System.out.println(p.nome);

        Produto p1 = new Produto("Caneta", 12.34, 0.09);
        imprimir.accept(p1);

        Produto p2 = new Produto("Caderno", 14.72, 0.05);
        Produto p3 = new Produto("Borracha", 1.23, 0.03);
        Produto p4 = new Produto("Lapis", 7.40, 0.07);
        Produto p5 = new Produto("Notebook", 3240, 0.19);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
        produtos.forEach(imprimir);
        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println);
    }
}
