package controle;

public class Switch {

    public static void main(String[] args) {

        // Imprima o dia da semana, considerando 1 como domingo

        byte dia = 10;

        switch (dia) {

            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Seg");
                break;
            case 3:
                System.out.println("Ter");
                break;
            case 4:
                System.out.println("Qua");
                break;
            case 5:
                System.out.println("Qui");
                break;
            case 6:
                System.out.println("Sex");
                break;
            case 7:
                System.out.println("Sab");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }

        char sexo = 'M';

        switch (sexo) {
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Inválido");
                break;
        }

        byte day = 1;

        switch (day) {
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
    }
}