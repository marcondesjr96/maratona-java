package maratonajava.exercicios.outros.dominio.test.teste;

import maratonajava.exercicios.outros.dominio.classes.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime naruto = new Anime();

        naruto.setNome("Naruto");
        naruto.setGenero("Acao");
        naruto.setEpisodios(45);
        naruto.setNumeroDePersonagens(4);
        naruto.setValorDoAnime(4521);
        naruto.imprimir();

    }
}
