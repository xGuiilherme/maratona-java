package padroesdeprojeto.test;

import padroesdeprojeto.singleton.AircraftSingletonEager;

public class AircratSingletonEagerTest {

    // Se por acaso alguem tentar chamar 2 vezes o mesmo asento ele tem que retornar false obrigatoriamente.
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat) {
        // Toda vez que chamar o método getINSTANCE vai ter exatamente o mesmo objeto do espaço em memoria.
        System.out.println(AircraftSingletonEager.getINSTANCE());
        AircraftSingletonEager aircraft = AircraftSingletonEager.getINSTANCE();
        System.out.println(aircraft.bookSeat(seat));
    }
}
