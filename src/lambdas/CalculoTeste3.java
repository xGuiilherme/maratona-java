package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

    public static void main(String[] args) {

        // Java não permite conversão direta: int -> Double ex: Double a = 1;
        // Java Permite double -> Double ex: Double a = 1.0, pois passa um double primitivo para Double do tipo Classe.

        BinaryOperator<Double> calc = (x, y) -> { return x + y; };
        System.out.println(calc.apply(2.0, 3.0));

        calc = (x, y) -> x * y;
        System.out.println(calc.apply(2.0, 3.0));

        BinaryOperator<Integer> calc2 = (x, y) -> { return x + y; };
        System.out.println(calc2.apply(2, 3));

        calc = (x, y) -> x * y;
        System.out.println(calc2.apply(2, 3));
    }
}
