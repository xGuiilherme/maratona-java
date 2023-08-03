package zcampo_minado.visao;

import zcampo_minado.excecao.ExplosaoException;
import zcampo_minado.excecao.SairException;
import zcampo_minado.modelo.Tabuleiro;

import java.util.Iterator;
import java.util.Scanner;

import static java.util.Arrays.stream;

public class TabuleiroConsole {

    private Tabuleiro tabuleiro;
    private Scanner entrada = new Scanner(System.in);

    public TabuleiroConsole(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;

        executarJogo();
    }

    private void executarJogo() {
        try {
            boolean continuar = true;

            while (continuar) {
                cicloDoJogo();

                System.out.println("Outra Partita? (S/N)");
                String resposta = entrada.nextLine();

                if ("n".equalsIgnoreCase(resposta)) {
                    continuar = false;
                } else {
                    tabuleiro.reiniciar();
                }
            }
        } catch (SairException e) {
            System.out.println("Tchau!!");
        } finally {
            entrada.close();
        }
    }

    private void cicloDoJogo() {
        try {
            while (!tabuleiro.objetivoAlcancado()) {
                System.out.println(tabuleiro);
                String digitado = capturarValorDigitado("Digite (x, y): ");

                Iterator<Integer> xy = stream(digitado.split(","))
                        .map(e -> Integer.parseInt(e)).iterator();

                System.out.println(xy.next());
            }
            System.out.println("Você ganhou!");
        } catch (ExplosaoException e) {
            System.out.println("Você perdeu!");
        }
    }

    private String capturarValorDigitado(String texto) {
        System.out.print(texto);
        String digitado = entrada.nextLine();

        if ("sair".equalsIgnoreCase(digitado)) {
            throw new SairException();
        }
        return digitado;
    }
}
