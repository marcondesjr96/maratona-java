package maratonajava.exercicios.Rgenerics.teste;

import maratonajava.exercicios.Rgenerics.dominio.Barco;
import maratonajava.exercicios.Rgenerics.dominio.Carro;
import maratonajava.exercicios.Rgenerics.service.BarcoRentavelService;
import maratonajava.exercicios.Rgenerics.service.CarroRentavelService;

public class ClasseGenericaTeste02 {
    public static void main(String[] args) {

        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarCarroDisponivel();
        System.out.println("Usando barco por um mês");
        barcoRentavelService.retornarBarcoAlugado(barco);

    }


}
