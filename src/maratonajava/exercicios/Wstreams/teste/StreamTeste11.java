package maratonajava.exercicios.Wstreams.teste;

import maratonajava.exercicios.Wstreams.dominio.Category;
import maratonajava.exercicios.Wstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTeste11 {
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

        Map<Category, List<LightNovel>> categoryListMap = new HashMap<>();
        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> romance = new ArrayList<>();

        for (LightNovel lightNovel : lightNovels) {
            switch (lightNovel.getCategory()){
                case DRAMA: drama.add(lightNovel);break;
                case FANTASY: fantasy.add(lightNovel); break;
                case ROMANCE: romance.add(lightNovel); break;
            }

        }
        categoryListMap.put(Category.DRAMA, drama);
        categoryListMap.put(Category.FANTASY, fantasy);
        categoryListMap.put(Category.ROMANCE, romance);
        System.out.println(categoryListMap);

// TODO O CODIGO A CIMA, SE TRANSFORMOU NESSE CODIGO ABAIXO, USANDO O STREAM!


        Map<Category, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);

    }
}
