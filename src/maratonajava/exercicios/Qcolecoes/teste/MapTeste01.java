package maratonajava.exercicios.Qcolecoes.teste;

import java.util.HashMap;
import java.util.Map;

public class MapTeste01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("teklado", "teclado");
        map.put("mause", "mouse");
        map.put("vc", "voce");
        System.out.println(map);
    }
}
