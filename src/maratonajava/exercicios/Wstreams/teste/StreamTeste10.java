package maratonajava.exercicios.Wstreams.teste;

import maratonajava.exercicios.Wstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTeste10 {
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
//pega a quantidade de ligth novels
        System.out.println(lightNovels.stream().count());
        System.out.println(lightNovels.stream().collect(Collectors.counting()));
//pega o valor maximo e minimo das light novel
        lightNovels.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
        lightNovels.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println);
        lightNovels.stream().collect(Collectors.minBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println);
        System.out.println();
//pega a soma dos preços da light novel
        System.out.println(lightNovels.stream().mapToDouble(LightNovel::getPrice).sum());
        System.out.println(lightNovels.stream().collect(Collectors.summingDouble(LightNovel::getPrice)));
        System.out.println();
//pega a Media dos preços da light Novel
        lightNovels.stream().mapToDouble(LightNovel::getPrice).average().ifPresent(System.out::println);
        System.out.println(lightNovels.stream().collect(Collectors.averagingDouble(LightNovel::getPrice)));
        System.out.println();
// pega todas as estatisticas da lista = quantidade, maximo, minimo, soma, media
        DoubleSummaryStatistics collect = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(collect);
        System.out.println();
//separa os titulos das light novels
        String titles = lightNovels.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(titles);

    }

}
