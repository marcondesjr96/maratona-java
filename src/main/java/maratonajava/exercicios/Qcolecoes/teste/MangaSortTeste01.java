package maratonajava.exercicios.Qcolecoes.teste;

import maratonajava.exercicios.Qcolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class CompareById implements Comparator<Manga>{

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTeste01 {
    public static void main(String[] args) {

        List<Manga> mangas = new ArrayList<>();

        mangas.add(new Manga(3L, "Pokemon", 4.99));
        mangas.add(new Manga(5L, "Dragon Ball Z", 1.99));
        mangas.add(new Manga(1L, "Berserk", 9.99));
        mangas.add(new Manga(2L, "Attack on titan", 8.99));
        mangas.add(new Manga(4L, "Hellsing Ultimate", 11.99));

        for(Manga manga : mangas){

            System.out.println(manga);
        }
        System.out.println("____________");
        Collections.sort(mangas);

        for(Manga manga : mangas){

            System.out.println(manga);
        }
        System.out.println("_____________");
        Collections.sort(mangas, new CompareById());

        for(Manga manga : mangas){

            System.out.println(manga);
        }

    }
}
