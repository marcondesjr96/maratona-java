package maratonajava.exercicios.Istring.test;

public class StringTeste01 {
    public static void main(String[] args) {
        String nome = "Shaco";
        String numeros = "012345";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.substring(0, 3));
        System.out.println(nome.replace('S','T')); //Troca a letra S pela letra T
        System.out.println(nome.toLowerCase()); // transforma tudo em letras minusculas
        System.out.println(nome.toUpperCase()); // transforma tudo em CapsLock
        System.out.println(numeros.length());
        System.out.println(numeros.substring(3,numeros.length()));
    }
}
