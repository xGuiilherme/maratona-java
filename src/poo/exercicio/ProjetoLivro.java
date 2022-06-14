package poo.exercicio;

public class ProjetoLivro {

    public static void main(String[] args) {

        Pessoa[] p = new Pessoa[3];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 25, "F");
        p[2] = new Pessoa("João", 18, "M");

        l[0] = new Livro("Harry Potter", "J.K Rowling", 288, p[0]);
        l[1] = new Livro("Senhor Dos Aneis", "J.R.R. Tolkien", 388, p[1]);
        l[2] = new Livro("Animais Fantásticos", "J.K. Rowling ", 106, p[2]);

        l[0].abrir();
        l[0].folhear(100);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());

        System.out.println(l[1].detalhes());
    }
}
