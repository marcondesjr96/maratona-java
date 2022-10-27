package maratonajava.exercicios.Voptional.teste;

import java.util.List;
import java.util.Optional;

public class OptionalTeste01 {
    public static void main(String[] args) {

        Optional<String> o1 = Optional.of("Testando o Optional");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();

//        System.out.println(name);
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println("______________");

        Optional<String> optionalName = findName("Marcondes");
        String empty = optionalName.orElse("EMPTY");
        System.out.println(empty);
        optionalName.ifPresent(s -> System.out.println(s.toUpperCase()));

    }


    private static Optional<String> findName(String name) {
        List<String> list = List.of("Marcondes", "Junior", "Silva");
        int i = list.indexOf(name);
        if (i != 1) {
            return Optional.of(list.get(i));
        }
        return Optional.empty();

    }
}
