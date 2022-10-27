package maratonajava.exercicios.Gexception.runtime.test;

import java.util.Scanner;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        try{
            division(1,0);

        }catch(RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("Continua operando");

    }

    public static int division(int a, int b) throws IllegalArgumentException{
        if (b == 0) {
            throw new IllegalArgumentException("Divisor nao pode ser 0");
        }
        return a/b;
    }
}
