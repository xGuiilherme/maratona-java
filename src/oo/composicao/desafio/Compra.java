package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    final List<Item> itens = new ArrayList<>(); //Faz a relação de Compra com Item.

    void adicionarItem(Produto p, int qtde) {
        this.itens.add(new Item(p, qtde)); //Crio o item passando o Produto e Quantidade.
    }

    // Inferencia 'var' auto: já cria o produto,já cria o item e ja adiciona o item dentro dos itens dessa compra.
    void adicionarItem(String nome, double preco, int qtde) {
        var produto = new Produto(nome, preco);
        this.itens.add(new Item(produto,qtde));
    }

    double obterValorTotal() {
        double total = 0;

        for (Item item : itens) {
            total += item.quantidade * item.produto.preco; //Acrescentando todos os items vai ter o total da compra inteira
        }

        return total;
    }
}
