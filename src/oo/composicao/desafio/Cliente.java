package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    final String nome;
    final List<Compra> compras = new ArrayList<>(); //Relação uni-direcional, faz relação de Cliente com Compra.

    Cliente(String nome) {
        this.nome = nome;
    }

    void adicionarCompra(Compra compra) {
        this.compras.add(compra);
    }

    double obterValorTotal() {
        double total = 0;

        for (Compra compra : compras) {
            total += compra.obterValorTotal();

        }

        return total;
    }
}
