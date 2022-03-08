package oo.composicao.desafio;

public class Item {

    final Produto produto; //Item tem relação com Produto, 1item aponta p/ 1unico Produto.
    final int quantidade;

    Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
}
