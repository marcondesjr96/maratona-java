package maratonajava.exercicios.outros.dominio.test.teste;

import maratonajava.exercicios.outros.dominio.metodos.Calculadora;

import java.util.Scanner;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner ler = new Scanner(System.in);
        calculadora.somaDoisNumeros();
        System.out.println("------------------------------");
        System.out.println("Digite um numero");
        int n = ler.nextInt();
        System.out.println("Digite o segundo numero");
        int n2 = ler.nextInt();
        calculadora.subtracaoDoisNumeros02(n, n2);
        System.out.println(calculadora.subtracaoDoisNumeros02(n, n2));


    }

}
