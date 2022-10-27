package maratonajava.exercicios.Kformatacao.teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTeste01 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        LocalDate date = LocalDate.of(2018, Month.APRIL, 14);
        LocalTime time = LocalTime.of(14,00);
        LocalDateTime ldt2 = LocalDateTime.of(1996,12,23,19,15);
        LocalDateTime ldt3 = LocalDateTime.of(date,time);

        System.out.println(ldt3);

    }
}
