package maratonajava.exercicios.Jdatas.teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class PeriodTeste01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusMonths(1).plusDays(5);
        Period[] periods = new Period[5];
        periods[0] = Period.between(now, nowAfterTwoYears);
        periods[1] = Period.ofDays(15);
        periods[2] = Period.ofWeeks(5);
        periods[3] = Period.ofMonths(2);
        periods[4] = Period.ofYears(2);
        System.out.println(periods[0]);
        System.out.println(periods[1]);
        System.out.println(periods[2]);
        System.out.println(periods[3]);
        System.out.println(periods[4]);
    }
}
