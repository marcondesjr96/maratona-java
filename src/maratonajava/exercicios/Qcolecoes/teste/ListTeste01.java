package maratonajava.exercicios.Qcolecoes.teste;

import java.util.ArrayList;
import java.util.List;

public class ListTeste01 {
    public static void main(String[] args) {
        List <String> nomes = new ArrayList<>();
        List <String> nomes2 = new ArrayList<>();
        nomes.add("Junior");
        nomes.add("Silva");
        nomes2.add("Marcondes");
        nomes2.add("Ferreira");
//        nomes.remove(0);
//        nomes.remove("Silva");
        nomes.addAll(nomes2);


        for (String nome : nomes){
            System.out.println(nome);
        }
        System.out.println("_________________");

        for (int i = 0; i <nomes2.size() ; i++) {
            System.out.println(nomes.get(i));
        }
    }
}
