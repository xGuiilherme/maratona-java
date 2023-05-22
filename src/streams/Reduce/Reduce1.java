package streams.Reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        BinaryOperator<Integer> soma = (ac, n) -> ac + n;

        // diferente de map e filter que sao funções intermediaria que retorna um outro stream, o reduce é como um forEach que seria uma função terminadora ou seja esta la na ponta
        // depois de criado nao tem como encadiar map/filter etc.
        Integer total1 = nums.stream().reduce(soma).get();
        System.out.println(total1);

        Integer total2 = nums.stream().reduce(100, soma);
        System.out.println(total2);

        // Resultado foi um Optional<Integer>...
        nums.stream()
                .filter(n -> n > 5)
                .reduce(soma)
                .ifPresent(System.out::println);
    }
}
