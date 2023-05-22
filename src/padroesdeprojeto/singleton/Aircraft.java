package padroesdeprojeto.singleton;

import java.util.HashSet;
import java.util.Set;

public final class Aircraft {
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    public Aircraft(String name) {
        this.name = name;
    }

    {
        availableSeats.add("1A");
        availableSeats.add("1A");
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }
}
