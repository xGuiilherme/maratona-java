package fundamentos;

import java.util.Scanner;

public class TipoString {

    public static void main(String[] args) {

        System.out.println("Olá".charAt(2));

        //String é um objeto imutavel, nunca vai conseguir mudar o valor atribuido a String
        String s = "Boa";
        System.out.println(s.concat("!!!"));

        s = s.toUpperCase();

        int a = 3;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite nome: ");
        String nome = entrada.nextLine();

        System.out.println("\nNome = " + nome);
    }
}
