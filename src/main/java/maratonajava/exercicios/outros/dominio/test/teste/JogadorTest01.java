package maratonajava.exercicios.outros.dominio.test.teste;

import maratonajava.exercicios.outros.dominio.classes.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {

        Jogador jogador01 = new Jogador("Messi");
        Jogador jogador02 = new Jogador("Neymar");
        Jogador jogador03 = new Jogador("CR7");
        Jogador[] jogadores = new Jogador[]{jogador01, jogador02, jogador03};


        for (Jogador jogadorVer : jogadores) {
            jogadorVer.imprimi();


        }
    }
}
