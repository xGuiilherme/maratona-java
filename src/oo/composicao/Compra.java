package oo.composicao;

import java.util.ArrayList;

public class Compra {

    String cliente;
    ArrayList<Item> itens = new ArrayList<Item>();

    // Esta recebendo os parametros, chamou o metodo de baixo 'adicionar o item na lista de itens, relacao Bidirecional'
    void adicionarItem(String nome, int quantidade, double preco) {
        this.adicionarItem(new Item(nome, quantidade, preco));
    }

    void adicionarItem(Item item) {
        this.itens.add(item);
        item.compra = this;
    }

    double getValorTotal() {
        double total = 0;

        for (Item item : itens) {
            total += item.quantidade * item.preco;
        }

        return total;
    }
}
