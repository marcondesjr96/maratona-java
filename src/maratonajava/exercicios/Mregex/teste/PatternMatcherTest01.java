package maratonajava.exercicios.Mregex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "aba";
        String texto = "abaabaababaabbaaababaaba";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  "+texto);
        System.out.println("indice: 0123456789012345678901");
        System.out.println("regex " +regex);
        System.out.println("Posicoes encontradas: ");

        while(matcher.find()){
            System.out.print(matcher.start()+ " ");
        }
    }
}
