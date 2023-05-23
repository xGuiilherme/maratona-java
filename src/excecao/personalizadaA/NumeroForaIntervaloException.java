package excecao.personalizadaA;

public class NumeroForaIntervaloException extends RuntimeException {

    private String nomeDoAtributo;

    public NumeroForaIntervaloException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    @Override
    public String getMessage() {
        return String.format("O atributo '%s' está fora do intervalo.", nomeDoAtributo);
    }
}
