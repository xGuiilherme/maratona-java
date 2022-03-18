package oo.polimorfismo;

public class Pessoa {

    private double peso;

    public Pessoa(double peso) {
        setPeso(peso);
    }

    // Polimorfismo estático: É a sobre cargas de metodos.
    // Sobre carga de metodos, usando o mesmo nome eu sobrecarreguei o metodo múltiplas vezes, com parametros diferentes;
    public void comer(Arroz arroz) {
        this.peso += arroz.getPeso();
    }

    public void comer(Feijao feijao) {
        this.peso += feijao.getPeso();
    }

    public void comer(Sorvete sorvete) {
        this.peso += sorvete.getPeso();
    }

    // Polimorfismo dinamico: Não precisa mais ter os metodos especificos p/ tipos especificos porq ele consegue passar
    // deforma polimorfica qual quer tipo que herda de comida Feijão, Arroz etc.Tipo que não foram criados ainda, desde
    // que esses tipos herdem de 'Comida'
    public void comer(Comida comida) {
        this.peso += comida.getPeso();
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso >= 0) {
            this.peso = peso;
        }
    }
}
