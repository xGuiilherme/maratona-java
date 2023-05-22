package padroesdeprojeto.singleton;

import java.util.HashSet;
import java.util.Set;

public final class AircraftSingletonLazy {

    private static AircraftSingletonLazy INSTANCE;

    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    private AircraftSingletonLazy(String name) {
        this.name = name;
    }

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    // Colocar synchronized no método inteiro perde performance. A finalidade do synchronized é evitar que você tenha problemas com estados indeterminados em um programa.
    // Se duas Threads diferentes tentem chamar o método, como é o método é synchronized, uma Thread terá de esperar que a Thread que chamou o método primeiro termine a execução.
    public synchronized static AircraftSingletonLazy getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new AircraftSingletonLazy("787-900");
        }
        return INSTANCE;
    }

    // Double lock: Tem mais garantina de ter duas instancias diferentes.
//    public static AircraftSingletonLazy getINSTANCE() {
//        if (INSTANCE == null) {
//            synchronized (AircraftSingletonLazy.class) {
//                if (INSTANCE == null) {
//                    INSTANCE = new AircraftSingletonLazy("787-900");
//                }
//            }
//        }
//        return INSTANCE;
//    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }
}
