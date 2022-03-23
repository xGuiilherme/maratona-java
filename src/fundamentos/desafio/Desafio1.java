package fundamentos.desafio;

import java.util.Scanner;

public class Desafio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("informe o primeiro salario:");
        String valor1 = entrada.next().replace(",", ".");

        System.out.print("informe o segundo salario:");
        String valor2 = entrada.next().replace(",", ".");

        System.out.print("informe o terceiro salario:");
        String valor3 = entrada.next().replace(",", ".");

        double salario1 = Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor2);
        double salario3 = Double.parseDouble(valor3);

        double media = (salario1 + salario2 + salario3) / 3;
        System.out.println("A media do salario é " + media);

        entrada.close();

    }
}
