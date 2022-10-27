package maratonajava.exercicios.Wstreams.teste;

import maratonajava.exercicios.Wstreams.dominio.Category;
import maratonajava.exercicios.Wstreams.dominio.LightNovel;
import maratonajava.exercicios.Wstreams.dominio.Promotion;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTeste13 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Avatar", 8.99, Category.FANTASY),
            new LightNovel("Sete Pecado Capitais", 3.99, Category.FANTASY),
            new LightNovel("One Piece", 2.99, Category.DRAMA),
            new LightNovel("Dragon Ball Z", 1.99, Category.FANTASY),
            new LightNovel("Dragon Ball Z", 1.99, Category.FANTASY),
            new LightNovel("Bob Esponja", 13.99, Category.ROMANCE),
            new LightNovel("Madagascar", 4.99, Category.FANTASY),
            new LightNovel("Mortal Kombat", 4.00, Category.DRAMA)
    ));

    public static void main(String[] args) {
        Map<Category, Long> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collect);
        Map<Category, Optional<LightNovel>> collect1 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect1);

        Map<Category, LightNovel> collect2 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));
        System.out.println(collect2);

    }


}
