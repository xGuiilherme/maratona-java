package padroesdeprojeto.test;

import padroesdeprojeto.singleton.AircraftSingletonEnum;

public class AircraftSingletonEnumTest {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat) {
        // Toda vez que chamar o método getINSTANCE vai ter exatamente o mesmo objeto do espaço em memoria.
        System.out.println(AircraftSingletonEnum.INSTANCE);
        AircraftSingletonEnum instance = AircraftSingletonEnum.INSTANCE;
        System.out.println(instance.bookSeat(seat));
    }
}
