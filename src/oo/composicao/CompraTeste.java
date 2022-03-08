package oo.composicao;

public class CompraTeste {

    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.cliente = "João Pedro";

        // Automaticamente, o metodo ja instancia o item e ja adiciona na lista dos itens.
        compra1.adicionarItem("Caneta", 20, 7.45);
        compra1.adicionarItem("Borracha", 12, 3.89);
        compra1.adicionarItem("Caderno", 3, 18.79);

        System.out.println(compra1.itens.size());
        System.out.println(compra1.getValorTotal());

        // Só pra mostrar a relação bidirecional.
        double total = compra1.itens.get(0).compra.itens.get(1).compra.getValorTotal();
        System.out.println("O valor é R$" + total);
    }
}
