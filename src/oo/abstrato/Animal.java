package oo.abstrato;

public abstract class Animal {

    // Uma Classe abstrata pode ou não ter metodos abstratos, ou seja pode ou não estár inacabado em termos de implementação.
    // Ex: É ter metodos abstratos, metodos que não tem implementação.

    public String respirar() {
        return "Usando Oxigênio";
    }

    public abstract String mover();
}
