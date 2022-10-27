package maratonajava.exercicios.Qcolecoes.teste;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTeste01 {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();
        fila.add("U");
        fila.add("F");
        fila.add("C");

        for (String s : fila){
            System.out.println(s);
        }
    }
}
