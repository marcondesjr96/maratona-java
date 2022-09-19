package maratonajava.exercicios.Rgenerics.teste;


import maratonajava.exercicios.Rgenerics.dominio.Carro;

import java.util.List;

public class MetodoGenericoTeste01 {
    public static void main(String[] args) {

        List<Carro> listOfCar = criarArrayComUmObjeto(new Carro("BMW"));
        System.out.println(listOfCar);

;    }
    private static <T> List<T> criarArrayComUmObjeto(T t){
        List<T> list = List.of(t);
        return List.of(t);

    }
}
