package streams.desafiomap;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class DesafioMap {

    /*    USANDO O MAP
     * 1. Número para string binária... 6 => "110"
     * 2. Ieverter a string... "110" => "011"
     * 3. Converter de volta para inteiro => "011" => 3
     */

    public static void main(String[] args) {

        // 1º Método para fazer o desafio

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // 1. Converter os nums para uma string binária. Ex: 6 => "110".
        List<String> numToBinaryString = nums
                .stream()
                .map(Integer::toBinaryString)
                .collect(Collectors.toList());
        System.out.println("1. " + numToBinaryString);

        // 2. Inverter a string. Ex: "110" => "011".
        List<String> stringReverse = numToBinaryString
                .stream()
                .map(num -> new StringBuilder(num)
                        .reverse().toString())
                .collect(Collectors.toList());
        System.out.println("\n2. " + stringReverse);

        // 3. Converter de volta para um Inteiro. Ex: "011" => 3.
        List<Integer> binaryStringToInteger = stringReverse
                .stream()
                .map(num -> Integer.parseInt(num, 2))
                .collect(Collectors.toList());
        System.out.println("\n3. " + binaryStringToInteger);

        // 2º Método para fazer o desafio
        int n = 6;
        String binary = Integer.toBinaryString(n);
        System.out.println("\n" + binary);

        String n2 = "110";
        System.out.println(new StringBuilder(n2).reverse());

        String binaryString = "011";
        int number = Integer.parseInt(binaryString, 2);
        System.out.println(number);

        // 3º Método para fazer o desafio
        UnaryOperator<String> inverter =
                str -> new StringBuilder(str).reverse().toString();

        Function<String, Integer> binaryParaInt =
                str -> Integer.parseInt(str, 2);

        nums.stream()
                .map(Integer::toBinaryString)
                .map(inverter)
                .map(binaryParaInt)
                .forEach(System.out::println);
    }
}
