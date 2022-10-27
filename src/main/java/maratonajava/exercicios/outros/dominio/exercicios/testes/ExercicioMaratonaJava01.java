package maratonajava.exercicios.outros.dominio.exercicios.testes;

import java.util.Scanner;

public class ExercicioMaratonaJava01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        System.out.println("Qual o valor do seu salario?");
        double taxaDeJuros01 = 9.70;
        double taxaDeJuros02 = 37.35;
        double taxaDeJuros03 = 49.50;
        double resultado;


        int salario = ler.nextInt();

        if(salario <= 34712 ) {
            resultado = salario * taxaDeJuros01 / 100;
            int iResultado = (int) resultado;
            System.out.println("Sua taxa de Juros e: " + iResultado);
            System.out.println("Seu salario liquido e: " + (salario - iResultado));
        }else if (salario > 34712 && salario <= 68507) {
            resultado = salario * taxaDeJuros02 / 100;
            int iResultado = (int) resultado;
            System.out.println("Sua taxa de Juros e: " + iResultado);
            System.out.println("Seu salario liquido e: " + (salario - iResultado));

        }else{
            resultado = salario * taxaDeJuros03 / 100;
            int iResultado = (int) resultado;
            System.out.println("Sua taxa de Juros e: " + iResultado);
            System.out.println("Seu salario liquido e: " + (salario - iResultado));

        }




    }
}
