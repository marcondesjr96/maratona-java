package maratonajava.exercicios.Wstreams.teste;

import java.util.List;

public class StreamTeste07 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);
        integers.stream().reduce((x, y) -> x+y).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(0,Integer::sum));


    }
}
