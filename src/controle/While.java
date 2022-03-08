package controle;

public class While {

    public static void main(String[] args) {

        int contador = 1;

        while (contador <= 10) {
            System.out.printf("i = %d\n", contador);
            contador += 2;
        }
    }
}
