package controle;

public class For {

    public static void main(String[] args) {

        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {

            if (i > 25) {
                break;
            }
            System.out.println("i = "+ i);
        }
    }
}
