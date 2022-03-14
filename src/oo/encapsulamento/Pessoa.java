package oo.encapsulamento;

public class Pessoa {

    private String nome;
    private int idade;
    private String sobrenome;

    public Pessoa(String nome, String sobrenome, int idade) {
        setNome(nome);
        setSobrenome(sobrenome);
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    // Não precisa necessariamente ter um atributo associado, chama de atributo calculado, está sendo calculado
    // a partir de um metodo sem precisar ter o atributo a sua disposição.
    public String getNomeCompleto() {
        return getNome() + " " + getSobrenome();
    }

    public int getIdade() {
        return idade;
    }

    // Setter - Validação de campos Encapsulados sem precisar definir na chamada.
    public void setIdade(int novaIdade) {
        novaIdade = Math.abs(novaIdade);
        if (idade >= 0 && novaIdade <= 120) {
            this.idade = novaIdade;
        }
    }

    @Override
    public String toString() {
        return "Olá eu sou o " + getNome()
                + " e tenho " + getIdade() + " anos.";
    }
}
