package padroesdeprojeto.test;

import padroesdeprojeto.singleton.Aircraft;

public class AircratSingletonTest {

    // Se por acaso alguem tentar chamar 2 vezes o mesmo asento ele tem que retornar false obrigatoriamente.
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat) {
        Aircraft aircraft = new Aircraft("787-900");
        System.out.println(aircraft.bookSeat(seat));
    }
}
