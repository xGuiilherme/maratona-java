package oo.heranca;

public class Heroi extends Jogador {

    // ao inves de sobrescrever o metodo completamente, voce pode reusar o metodo de cima.
    // super chama o metodo da super classe, ou seja, chama o metdo pai p/ atacar 2x

    Heroi(int x, int y) {
        super(x, y);
    }

    boolean atacar(Jogador oponente) {

        boolean ataque1 = super.atacar(oponente);
        boolean ataque2 = super.atacar(oponente);
        boolean ataque3 = super.atacar(oponente);

        return ataque1 || ataque2 || ataque3;
    }
}