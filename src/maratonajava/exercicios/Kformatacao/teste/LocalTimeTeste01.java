package maratonajava.exercicios.Kformatacao.teste;

import java.time.LocalTime;

public class LocalTimeTeste01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(22,30);
        LocalTime agora = LocalTime.now();
        System.out.println(agora);
        System.out.println(time);
    }
}
