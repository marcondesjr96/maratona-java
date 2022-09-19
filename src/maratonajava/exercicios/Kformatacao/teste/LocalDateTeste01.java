package maratonajava.exercicios.Kformatacao.teste;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class LocalDateTeste01 {
    public static void main(String[] args) {
        System.out.println(new Date());
//        System.out.println(Calendar.getInstance());
//        System.out.println(Month.JANUARY.getValue());
        LocalDate date = LocalDate.of(2022,Month.DECEMBER,23);
        LocalDate agora = LocalDate.now();
        System.out.println(date.getMonthValue());
        System.out.println(date.getMonth());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date);
        System.out.println(agora);
    }
}
