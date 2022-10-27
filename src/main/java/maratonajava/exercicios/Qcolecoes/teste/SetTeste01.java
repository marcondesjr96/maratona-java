package maratonajava.exercicios.Qcolecoes.teste;

import maratonajava.exercicios.Qcolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTeste01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();

        mangas.add(new Manga(3L, "Pokemon", 4.99));
        mangas.add(new Manga(5L, "Dragon Ball Z", 1.99));
        mangas.add(new Manga(1L, "Berserk", 9.99));
        mangas.add(new Manga(2L, "Attack on titan", 8.99));
        mangas.add(new Manga(4L, "Hellsing Ultimate", 11.99));
        mangas.add(new Manga(4L, "Hellsing Ultimate", 11.99));

        for (Manga manga : mangas){
            System.out.println(manga);
        }
    }
}
