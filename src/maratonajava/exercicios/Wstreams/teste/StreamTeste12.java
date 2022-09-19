package maratonajava.exercicios.Wstreams.teste;

import maratonajava.exercicios.Wstreams.dominio.Category;
import maratonajava.exercicios.Wstreams.dominio.LightNovel;
import maratonajava.exercicios.Wstreams.dominio.Promotion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTeste12 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Avatar", 8.99, Category.FANTASY),
            new LightNovel("Sete Pecado Capitais", 3.99, Category.FANTASY),
            new LightNovel("One Piece", 2.99,Category.DRAMA),
            new LightNovel("Dragon Ball Z", 1.99,Category.FANTASY),
            new LightNovel("Dragon Ball Z", 1.99,Category.FANTASY),
            new LightNovel("Bob Esponja", 13.99, Category.ROMANCE),
            new LightNovel("Madagascar", 4.99,Category.FANTASY),
            new LightNovel("Mortal Kombat", 4.00, Category.DRAMA)
    ));

    public static void main(String[] args) {
        Map<Promotion, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE));
        System.out.println(collect);

    }
}
