package padroesdeprojeto.test;

import padroesdeprojeto.factory.CountryEnum;
import padroesdeprojeto.factory.Currency;
import padroesdeprojeto.factory.CurrencyFactory;

public class CurrencyFactoryTest {

    // Aqui ele cria uma nova moeda, mas nao importa qual moeda é essa ou como essa modea esta sendo criada o que importa é que essa moeda vai ser criada.
    // A vantagem desse Pattern é que esta desacoplando e se mudar a regra de negocio ele não é afetado.
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(CountryEnum.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}
