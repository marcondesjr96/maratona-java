package maratonajava.exercicios.Qcolecoes.teste;

import maratonajava.exercicios.Qcolecoes.dominio.Consumidor;
import maratonajava.exercicios.Qcolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTeste03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Goku");
        Consumidor consumidor2 = new Consumidor("Vegeta");

        Manga manga1 = new Manga(3L, "Pokemon", 4.99);
        Manga manga2 = new Manga(5L, "Dragon Ball Z", 1.99);
        Manga manga3 = new Manga(1L, "Berserk", 9.99);
        Manga manga4 = new Manga(2L, "Attack on titan", 8.99);
        Manga manga5 = new Manga(4L, "Hellsing Ultimate", 11.99);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, manga1);
        consumidorManga.put(consumidor2, manga4);


    }
}
