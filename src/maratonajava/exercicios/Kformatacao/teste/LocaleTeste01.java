package maratonajava.exercicios.Kformatacao.teste;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTeste01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeBrasil = new Locale("pt", "BR");
        Locale localeJapan = new Locale("ja", "JP");

        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeBrasil);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);

        System.out.println("Brasil "+df1.format(calendar.getTime()));
        System.out.println("Italia "+df2.format(calendar.getTime()));
        System.out.println("Japao "+df3.format(calendar.getTime()));

    }
}
