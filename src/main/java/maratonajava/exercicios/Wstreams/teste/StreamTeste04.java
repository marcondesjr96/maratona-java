package maratonajava.exercicios.Wstreams.teste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class StreamTeste04 {
    public static void main(String[] args) {
        List<List<String>> listOfList = new ArrayList<>();
        List<String> graphicDesigners = List.of("Wesley Santos", "Matheus Roberts", "Alicia Alves");
        List<String> developers = List.of("Marcondes Jr", "Erickson Ferreira", "Wesley Roberts");
        List<String> students = List.of("Taynan Beatriz", "Milka Senna", "Mateus Silvestre");
        listOfList.add(graphicDesigners);
        listOfList.add(developers);
        listOfList.add(students);
        for (List<String> people : listOfList) {
            for (String person : people) {
                System.out.println(person);
            }
        }
        System.out.println("__________");
        listOfList.stream().flatMap(Collection::stream).forEach(System.out::println);

    }
}
