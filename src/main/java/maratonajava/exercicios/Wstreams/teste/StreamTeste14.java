package maratonajava.exercicios.Wstreams.teste;

import maratonajava.exercicios.Wstreams.dominio.Category;
import maratonajava.exercicios.Wstreams.dominio.LightNovel;
import maratonajava.exercicios.Wstreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTeste14 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Avatar", 8.99, Category.FANTASY),
            new LightNovel("Sete Pecado Capitais", 3.99, Category.DRAMA),
            new LightNovel("One Piece", 2.99,Category.DRAMA),
            new LightNovel("Dragon Ball Z", 1.99,Category.FANTASY),
            new LightNovel("Dragon Ball Z", 1.99,Category.FANTASY),
            new LightNovel("Bob Esponja", 13.99, Category.ROMANCE),
            new LightNovel("Madagascar", 4.99,Category.FANTASY),
            new LightNovel("Mortal Kombat", 4.00, Category.DRAMA)
    ));

    public static void main(String[] args) {
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);
        Map<Category, List<Promotion>> collect1 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(StreamTeste14::getPromotion, Collectors.toList())));
        System.out.println(collect1);
    }

    private static Promotion getPromotion(LightNovel lightNovel) {
        return lightNovel.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }
}
