package maratonajava.exercicios.Dmodificadorfinal.teste;

import maratonajava.exercicios.Dmodificadorfinal.dominio.Carro;
import maratonajava.exercicios.Dmodificadorfinal.dominio.Comprador;
import maratonajava.exercicios.Dmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador2 = new Comprador();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("GG");
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setIdade(35);
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("meu carro");
        ferrari.imprime();

    }
}
