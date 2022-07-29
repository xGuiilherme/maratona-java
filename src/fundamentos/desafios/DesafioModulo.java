package fundamentos.desafios;

import java.util.Scanner;

public class DesafioModulo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o numero: ");
        double num1 = entrada.nextDouble();

        System.out.print("Informe o numero: ");
        double num2 = entrada.nextDouble();

        System.out.print("Informe a operação: ");
        String op = entrada.next();

        System.out.printf("%.2 %f %s $f = ?", num1, num2, op);
        entrada.close();
    }
}
