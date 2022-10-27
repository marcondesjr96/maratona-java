package maratonajava.exercicios.outros.dominio.test.classes;

import maratonajava.exercicios.outros.dominio.classes.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        carro01.nome = "Renault";
        carro01.ano = 2019;
        carro01.modelo = "Kwid";
        System.out.println(carro01.nome +" " + carro01.ano+" "+carro01.modelo);

        System.out.println("---------------------------------------------------");

        Carro carro02 = new Carro();
        carro02.nome = "Chevrolet";
        carro02.ano = 2022;
        carro02.modelo = "Cobalt";
        System.out.println(carro02.nome +" " + carro02.ano+" "+carro02.modelo);
    }
}
