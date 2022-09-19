package maratonajava.exercicios.Wstreams.teste;

import maratonajava.exercicios.Wstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTeste03 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Avatar", 8.99),
            new LightNovel("Sete Pecado Capitais", 3.99),
            new LightNovel("One Piece", 2.99),
            new LightNovel("Dragon Ball Z", 1.99),
            new LightNovel("Dragon Ball Z", 1.99),
            new LightNovel("Bob Esponja", 13.99),
            new LightNovel("Madagascar", 4.99),
            new LightNovel("Mortal Kombat", 4.00)
    ));

    public static void main(String[] args) {
        Stream<LightNovel> stream = lightNovels.stream();
        lightNovels.forEach(System.out::println);
        long count = stream.distinct().filter(lightNovel -> lightNovel.getPrice() <= 4).count();
        System.out.println(count);
    }
}
