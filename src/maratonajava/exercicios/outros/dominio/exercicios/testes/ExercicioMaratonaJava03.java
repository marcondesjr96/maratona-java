package maratonajava.exercicios.outros.dominio.exercicios.testes;

import java.util.Scanner;

public class ExercicioMaratonaJava03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o valor do Carro?");
        int valorDoCarro = ler.nextInt();

        for (int parcela = 1; parcela <= valorDoCarro; parcela++) {

            double valorDaParcela = valorDoCarro / parcela;

            if (valorDaParcela >= 1000){
                System.out.println("Parcela " + parcela + " R$ " + valorDaParcela);
            }else{

                break;
            }

        }


    }
}
