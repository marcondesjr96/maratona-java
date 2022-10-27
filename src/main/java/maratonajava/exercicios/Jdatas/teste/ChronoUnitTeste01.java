package maratonajava.exercicios.Jdatas.teste;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTeste01 {
    public static void main(String[] args) {
        LocalDate birthDay = LocalDate.of(1996,12,23);
        LocalDate now = LocalDate.now();
        System.out.println(ChronoUnit.DAYS.between(birthDay, now));
        System.out.println(ChronoUnit.WEEKS.between(birthDay, now));
        System.out.println(ChronoUnit.MONTHS.between(birthDay, now));
        System.out.println(ChronoUnit.YEARS.between(birthDay, now));
    }
}
