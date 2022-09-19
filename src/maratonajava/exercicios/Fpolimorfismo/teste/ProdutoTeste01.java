package maratonajava.exercicios.Fpolimorfismo.teste;

import maratonajava.exercicios.Fpolimorfismo.dominio.Bicicleta;
import maratonajava.exercicios.Fpolimorfismo.dominio.Computador;
import maratonajava.exercicios.Fpolimorfismo.dominio.Produto;
import maratonajava.exercicios.Fpolimorfismo.dominio.Tomate;
import maratonajava.exercicios.Fpolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10I7", 5000);
        Tomate tomate = new Tomate("Tomate novo", 500);
        Bicicleta bike = new Bicicleta("Pneu fino", 900.85);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("--------------------------------------");
        CalculadoraImposto.calcularImposto(tomate);

        System.out.println("*************************************");

        Produto produto = new Computador("Ryzen 5", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println("***********-**********-**********-***********-");
        CalculadoraImposto.calcularImposto(bike);



    }
}
