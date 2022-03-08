package controle;

import java.util.Scanner;

public class If {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a media: ");
        double media = entrada.nextDouble();

        if ((media <= 10) && (media >= 7.0)) {
            System.out.println("Aprovado, " + "Parabens!");

        } else {
            System.out.println("Reprovado !");
        }

        entrada.close();
    }
}

