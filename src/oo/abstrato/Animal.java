package oo.abstrato;

public abstract class Animal {

    /*
    Classe abstrata não pode ser instanciada, só pode servir como Progenitora/Herdada ela pode ou não ter metodos
    abstratos ou seja pode ou não estár inacabado em termos de implementação.

    Ex: É ter um metodo abstrato que não tenha nenhuma implementação.
    */
    public String respirar() {
        return "Usando Oxigênio";
    }

    public abstract String mover();
}
