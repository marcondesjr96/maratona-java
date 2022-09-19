package maratonajava.exercicios.Rgenerics.teste;

import maratonajava.exercicios.Rgenerics.dominio.Barco;
import maratonajava.exercicios.Rgenerics.dominio.Carro;
import maratonajava.exercicios.Rgenerics.service.BarcoRentavelService;
import maratonajava.exercicios.Rgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTeste03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Mercedez")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Iate")));

        RentalService<Carro> rentalService = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalService.buscarObjetoDisponivel();
        System.out.println("Usando carro por um mes...");
        rentalService.retornarObjetoAlugado(carro);

        System.out.println("___________________");

        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalServiceBarco.buscarObjetoDisponivel();
        System.out.println("Usando carro por um mes...");
        rentalServiceBarco.retornarObjetoAlugado(barco);

    }


}
