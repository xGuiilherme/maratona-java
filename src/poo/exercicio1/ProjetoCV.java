package poo.exercicio1;

public class ProjetoCV {

    public static void main(String[] args) {

        Video[] v = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 5 de Python");

        Gafanhoto[] g = new Gafanhoto[2];
        g[0] = new Gafanhoto("Guilherme", 28, "M", "marin");
        g[1] = new Gafanhoto("Maria", 16, "F", "maria1");

        Visualizacao[] vis = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]); // Assiste Python
        vis[0].avaliar();
        System.out.println(vis[0]);

        vis[1] = new Visualizacao(g[0], v[1]); // Assiste PHP
        vis[0].avaliar(87.0f);
        System.out.println(vis[1]);

        System.out.println("VIDEOS\n ------------------------");
        System.out.println(v[0]);
        System.out.println(v[1]);
        System.out.println(v[2]);
        System.out.println("\nGAFANHOTOS\n ------------------------");
        System.out.println(g[0]);
        System.out.println(g[1]);
    }
}
