package poo.exercicio1;

public class Gafanhoto extends Pessoa {

    private String login;
    private int totalAssistindo;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totalAssistindo = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistindo() {
        return totalAssistindo;
    }

    public void setTotalAssistindo(int totalAssistindo) {
        this.totalAssistindo = totalAssistindo;
    }

    @Override
    public String toString() {
        return "Gafanhoto { " + super.toString() +
                " login = '" + login + '\'' +
                ", totalAssistindo = " + totalAssistindo +
                '}';
    }
}
