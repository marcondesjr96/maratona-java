package maratonajava.exercicios.AAexercicio.teste;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        int number;
        int hours;
        double salarioPorHora;
        double salario;
        String condicao = null;


        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);


            System.out.println("Informe o seu número: ");
            number = leitor.nextInt();
            System.out.println("Informe a quantidade de horas trabalhada: ");
            hours = leitor.nextInt();
            System.out.println("Informe quanto você ganha por hora: ");
            salarioPorHora = leitor.nextDouble();
            salario = salarioPorHora * hours;


            System.out.println("Number = " + number);
            System.out.println("Salary = U$ " + salario);






    }
}
