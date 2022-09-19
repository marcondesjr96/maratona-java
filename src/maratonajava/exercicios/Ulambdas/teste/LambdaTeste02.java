package maratonajava.exercicios.Ulambdas.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTeste02 {
    public static void main(String[] args) {

        List<String> lol = List.of("Nasus", "Pantheon", "Lux", "Morgana");
        List<Integer> integers = map(lol, (String s) -> s.length());
        List<String> map = map(lol, (String s) -> s.toUpperCase());
        System.out.println(map);
        System.out.println(integers);
    }
    private static <T, R> List<R> map(List<T> list, Function<T, R> function){
        List<R> result = new ArrayList<>();
        for (T e : list) {
            R r = function.apply(e);
            result.add(r);

        }

        return result;

    }
}
