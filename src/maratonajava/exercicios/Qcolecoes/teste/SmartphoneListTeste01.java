package maratonajava.exercicios.Qcolecoes.teste;

import maratonajava.exercicios.Qcolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTeste01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "iPhone");
        Smartphone s2 = new Smartphone("X1DS2", "LG");
        Smartphone s3 = new Smartphone("2DFW1", "Samsung");

        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);
//        smartphones.clear();

        for(Smartphone smt : smartphones){
            System.out.println(smt);
        }
        Smartphone s4 = new Smartphone("X1DS2", "LG");
        smartphones.add(0,s4);

        System.out.println(smartphones.contains((s4)));
        int indexSmartphone4 = smartphones.indexOf(s4);
        System.out.println(indexSmartphone4);

        System.out.println(smartphones.size());

    }
}
