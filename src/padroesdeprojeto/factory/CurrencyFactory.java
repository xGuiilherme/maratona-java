package padroesdeprojeto.factory;

public class CurrencyFactory {

    public static Currency newCurrency(CountryEnum countryEnum) {
        switch (countryEnum) {
            case USA:
                return new UsDollar();
            case BRAZIL:
                return new Real();
            default:
                throw new IllegalArgumentException("No currency found for this country");
        }
    }
}
