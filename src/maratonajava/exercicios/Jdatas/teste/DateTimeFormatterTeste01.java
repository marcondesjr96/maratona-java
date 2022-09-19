package maratonajava.exercicios.Jdatas.teste;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTeste01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String format1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String format2 = date.format(DateTimeFormatter.ISO_DATE);
        String format3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(format1);
        System.out.println(format2);
        System.out.println(format3);

        LocalDate parse1 = LocalDate.parse("20210219", DateTimeFormatter.BASIC_ISO_DATE); // Formatter: Transforma objeto em String || Parse: Transforma String em Objeto
        LocalDate parse2 = LocalDate.parse("2021-02-19+05:00", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2021-02-19", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);
    }
}
