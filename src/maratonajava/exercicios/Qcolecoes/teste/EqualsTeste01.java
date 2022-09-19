package maratonajava.exercicios.Qcolecoes.teste;

import maratonajava.exercicios.Qcolecoes.dominio.Smartphone;

public class EqualsTeste01 {
    public static void main(String[] args) {
//        String nome = "Junior Silva";
//        String nome2 = new String ("Junior Silva");
//        System.out.println(nome.equals(nome2));

        Smartphone s1 = new Smartphone("12ABC12", "iPhone");
        Smartphone s2 = new Smartphone("12ABC12", "iPhone");

        System.out.println(s1.equals(s2));
        System.out.println(s1.getSerialNumber().hashCode());
    }
}
