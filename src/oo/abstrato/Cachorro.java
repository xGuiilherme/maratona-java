package oo.abstrato;

public class Cachorro extends Mamifero {

    // Classe concreta tem todos com metodos definidos, ou seja ela tem que estár 100% definida.
    @Override
    public String mover() {
        return "Usando as patas";
    }

    @Override
    public String mamar() {
        return "Usando leite";
    }
}
