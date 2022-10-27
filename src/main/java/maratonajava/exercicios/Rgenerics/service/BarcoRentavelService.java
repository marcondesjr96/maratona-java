package maratonajava.exercicios.Rgenerics.service;

import maratonajava.exercicios.Rgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Iate")));

    public Barco buscarCarroDisponivel(){
        System.out.println("Buscando barco disponivel....");
        Barco barco = barcosDisponiveis.remove(0);
        System.out.println("Alugando barco: "+barco );
        System.out.println("Barcos disponiveis para alugar: ");
        System.out.println(barcosDisponiveis);
        return barco;
    }

    public void retornarBarcoAlugado(Barco barco){
        System.out.println("Devolvendo barco "+barco);
        barcosDisponiveis.add(barco);
        System.out.println("Barcos disponiveis para alugar:");
        System.out.println(barcosDisponiveis);
    }
}
