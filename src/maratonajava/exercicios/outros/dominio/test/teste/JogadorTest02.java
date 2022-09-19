package maratonajava.exercicios.outros.dominio.test.teste;

import maratonajava.exercicios.outros.dominio.classes.Jogador;
import maratonajava.exercicios.outros.dominio.classes.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Messi");
        Time time = new Time("PSG");

        jogador01.setTime(time);
        jogador01.imprimi();
    }
}
