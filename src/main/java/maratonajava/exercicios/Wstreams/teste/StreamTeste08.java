package maratonajava.exercicios.Wstreams.teste;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTeste08 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,50).filter(n-> n % 2 ==0).forEach(n-> System.out.print(n+" "));
        System.out.println();
        IntStream.range(1,50).filter(n-> n % 2 ==0).forEach(n-> System.out.print(n+" "));
        System.out.println();

        Stream.of("Eleve", "O", "Cosmo", "do", "Seu", "Coração").map(String::toUpperCase).forEach(s-> System.out.print(s+ " "));
        System.out.println();

        int n[] = {1,2,3,4,5};
        Arrays.stream(n).average().ifPresent(System.out::println);

    }
}
