package maratonajava.exercicios.Lresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTeste01 {
    public static void main(String[] args) {

        String ingles = "en";
        String eua = "US";

        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        ResourceBundle bundle2 = ResourceBundle.getBundle("messages", new Locale(ingles, eua));
        System.out.println(bundle2.getString("hello"));
        System.out.println(bundle2.getString("good.morning"));

    }
}
