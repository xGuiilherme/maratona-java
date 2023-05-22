package padroesdeprojeto.factory;

public interface Currency {

    String getSymbol();
}

// Aqui temos 2 Classes implementando uma modea a ideia é desaclopar ou seja criar uma moeda baseado em um parametro.

class Real implements Currency {

    @Override
    public String getSymbol() {
        return "R$";
    }
}

class UsDollar implements Currency {

    @Override
    public String getSymbol() {
        return "$";
    }
}