package maratonajava.exercicios.outros.dominio.exercicios.testes;

import java.util.Scanner;

public class ExercicioMaratonaJava02 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Qual a data do dia de hoje?");
        int dia =  ler.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Domingo, Final de Semana");
                break;
            case 2:
                System.out.println("Segunda, dia util")
                ;break;
            case 3:
                System.out.println("Terca, dia util")
                ;break;
            case 4:
                System.out.println("Quarta, dia util")
                ;break;
            case 5:
                System.out.println("Quinta, dia util")
                ;break;
            case 6:
                System.out.println("Sexta, dia util");
                break;
            case 7:
                System.out.println("Sabado, Final de Semana")
                ;break;
            default:
                System.out.println("Inválido");

        }
    }
}
