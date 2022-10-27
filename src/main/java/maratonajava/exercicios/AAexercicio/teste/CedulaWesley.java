package maratonajava.exercicios.AAexercicio.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CedulaWesley {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valorTotal = ler.nextInt();
        int multi = 0;
        Integer[] cedulas = new Integer[]{100,50,20,10,5,2,1};
        for (int i = 0; i < cedulas.length;) {
            while (cedulas[i]<=valorTotal){
                    multi = multi +1;
                   valorTotal = valorTotal-cedulas[i];

            }
            System.out.println(multi + " nota de " + cedulas[i]);
            multi=0;
            i++;
        }
    }
}
