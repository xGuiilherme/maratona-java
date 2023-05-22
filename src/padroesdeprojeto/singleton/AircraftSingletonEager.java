package padroesdeprojeto.singleton;

import java.util.HashSet;
import java.util.Set;

public final class AircraftSingletonEager {

    // Eager initialization: Toda vez que executar o getINSTANCE ele sempre vai retornar o valor pois ele é FINAL e Statico.
    private static final AircraftSingletonEager INSTANCE = new AircraftSingletonEager("787-900");

    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    private AircraftSingletonEager(String name) {
        this.name = name;
    }

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public static AircraftSingletonEager getINSTANCE() {
        return INSTANCE;
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }
}
