package maratonajava.exercicios.Wstreams.teste;

import maratonajava.exercicios.Wstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTeste02 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Avatar", 8.99),
            new LightNovel("Sete Pecado Capitais", 3.99),
            new LightNovel("One Piece", 2.99),
            new LightNovel("Dragon Ball Z", 1.99),
            new LightNovel("Bob Esponja", 13.99),
            new LightNovel("Madagascar", 4.99),
            new LightNovel("Mortal Kombat", 4.00)
    ));

    public static void main(String[] args) {
        List<String> list = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(ln -> ln.getPrice() <= 4)
                .limit(3)
                .map(LightNovel::getTitle)
                .collect(Collectors.toList());

        System.out.println(list);

    }
}
