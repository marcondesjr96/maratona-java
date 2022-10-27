package maratonajava.exercicios.Wstreams.teste;

import maratonajava.exercicios.Wstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTeste01 {
    //Uso do Stream no StreamTeste02

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Avatar", 8.99),
            new LightNovel("Sete Pecado Capitais", 3.99),
            new LightNovel("One Piece", 2.99),
            new LightNovel("Dragon Ball Z", 1.99),
            new LightNovel("Bob Esponja", 13.99),
            new LightNovel("Madagascar", 4.99),
            new LightNovel("Mortal Kombat", 4.00)
    ));
//1. Ordenar a lista por titulo
//2. Mostrar os 3 primeiros titulos no valor abaixo de 4.00
    public static void main(String[] args) {
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
        List<String> titles = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels) {
            if (lightNovel.getPrice() <= 4.00){
                titles.add(lightNovel.getTitle());
            }
            if (titles.size()==3){
                break;
            }

        }


        System.out.println(lightNovels);
        System.out.println(titles);


    }
}
