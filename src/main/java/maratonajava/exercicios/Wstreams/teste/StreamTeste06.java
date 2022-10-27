package maratonajava.exercicios.Wstreams.teste;

import maratonajava.exercicios.Wstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTeste06 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Avatar", 9.99),
            new LightNovel("Sete Pecado Capitais", 3.99),
            new LightNovel("One Piece", 2.99),
            new LightNovel("Dragon Ball Z", 1.99),
            new LightNovel("Dragon Ball Z", 1.99),
            new LightNovel("Bob Esponja", 13.99),
            new LightNovel("Madagascar", 4.99),
            new LightNovel("Mortal Kombat", 4.00)
    ));

    public static void main(String[] args) {
        System.out.println(lightNovels.stream().anyMatch(lightNovel -> lightNovel.getPrice() >8));
        System.out.println(lightNovels.stream().allMatch(lightNovel -> lightNovel.getPrice() > 0));
        System.out.println(lightNovels.stream().noneMatch(lightNovel -> lightNovel.getPrice() > 0));
        lightNovels.stream().filter(lightNovel -> lightNovel.getPrice()>3).findAny().ifPresent(System.out::println);
        lightNovels.stream().filter(lightNovel -> lightNovel.getPrice()>3).findFirst().ifPresent(System.out::println);

    }
}
