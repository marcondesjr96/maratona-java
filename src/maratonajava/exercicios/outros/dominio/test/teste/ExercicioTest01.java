package maratonajava.exercicios.outros.dominio.test.teste;

import maratonajava.exercicios.outros.dominio.classes.Exercicio;

import java.util.Scanner;

public class ExercicioTest01 {
    public static void main(String[] args) {
        Exercicio test01 = new Exercicio();

        Scanner ler = new Scanner (System.in);
        System.out.println("Qual a idade do garoto?");
        test01.setIdade(ler.nextInt());
        System.out.println("Qual o nome do garoto?");
        test01.setNome(ler.next());
        System.out.println("Qual o salario do garoto?");
        test01.setSalario(ler.nextDouble());
        System.out.println("Quantidade de amigos");
        test01.setAmigos(ler.nextInt());
        System.out.println("-*--*-*------*----*-----*------*-----*");

        test01.imprimir();

    }
}
