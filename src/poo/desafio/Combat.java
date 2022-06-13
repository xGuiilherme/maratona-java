package poo.desafio;

public class Combat {

    public static void main(String[] args) {

        Lutador[] l = new Lutador[6];

        l[0] = new Lutador("Royce Gracie", "Brasil", 31, 1.75f,
                68.9f, 11, 2, 1);

        l[1] = new Lutador("Marco Ruas", "Brasil", 29, 1.68f,
                57.8f, 14, 2, 3);

        l[2] = new Lutador("Lyoto Machida", "Austrália", 28, 1.93f,
                81.6f, 12, 2, 1);

        l[3] = new Lutador("Vitor Kley", "França", 35, 1.65f,
                80.9f, 12, 0, 1);

        l[4] = new Lutador("Gilbert Burns", "EUA", 37, 1.70f,
                119.3f, 5, 4, 3);

        l[5] = new Lutador("Charles Oliveira", "Brasil", 30, 1.81f,
                105.7f, 9, 3, 4);

        Luta UFC01 = new Luta();
        UFC01.marcarLuta(l[1], l[5]);
        UFC01.lutar();
    }
}
