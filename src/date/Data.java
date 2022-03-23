package date;

public class Data {

    int dia;
    int mes;
    int ano;

    String obterDataFormat() {
        return String.format("%d/%d/%d", dia, mes, ano);
    }
}
