package maratonajava.exercicios.Rgenerics.teste;

import maratonajava.exercicios.Rgenerics.dominio.Carro;
import maratonajava.exercicios.Rgenerics.service.CarroRentavelService;

public class ClasseGenericaTeste01 {
    public static void main(String[] args) {

        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando carro por um mês");
        carroRentavelService.retornarCarroAlugado(carro);

    }


}
