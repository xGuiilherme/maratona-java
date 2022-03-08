package fundamentos;

public class Conversao {

    public static void main(String[] args) {

        double a = 1; // implicita
        System.out.println(a);

        float b = (float) 1.12345; // conversao explicita (CAST)
        System.out.println(b);

        // Java nao analisa valores somente 'Tipos'
        int c = 4;
        byte d = (byte) c; // conversao explicita (CAST)
        System.out.println(d);

        double e = 1.9999;
        int f = (int) e; // conversao explicita (CAST)
        System.out.println(f);
    }
}
