package excecao;

public class ChecadaVsNaoChecada {

    public static void main(String[] args) {

        geraErro1();
        geraErro2();

        System.out.println("Fim :)");
    }

    static void geraErro1() {
        throw new RuntimeException("Ocorreu um erro aqui #01");
    }

    static void geraErro2() {
        throw new RuntimeException("Ocorreu um erro aqui #02");
    }
}
