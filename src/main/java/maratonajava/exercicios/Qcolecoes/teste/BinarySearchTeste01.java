package maratonajava.exercicios.Qcolecoes.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTeste01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(1);
        numeros.add(8);
        numeros.add(0);

        Collections.sort(numeros);
        int bin = Collections.binarySearch(numeros, 8);
        System.out.println(bin);
    }
}
