package maratonajava.exercicios.Mregex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d= Todos os digitos
        // \D= Tudo o que nao for dígito
        // \s = Espacos em Brancos \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-ZA-Z, digitios, _
        // \W = Tudo o que nao for incluso no \w

        String regex = "\\D";
        String texto = "a212aab3b5aba67a0a";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  "+texto);
        System.out.println("indice: 0123456789012345678901");
        System.out.println("regex " +regex);
        System.out.println("Posicoes encontradas: ");

        while(matcher.find()){
            System.out.print(matcher.start()+ " "+matcher.group()+"\n");
        }
    }
}
