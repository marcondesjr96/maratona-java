package maratonajava.exercicios.Fpolimorfismo.teste;

import maratonajava.exercicios.Fpolimorfismo.dominio.Computador;
import maratonajava.exercicios.Fpolimorfismo.dominio.Produto;
import maratonajava.exercicios.Fpolimorfismo.dominio.Tomate;
import maratonajava.exercicios.Fpolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 5440);
        Tomate tomate = new Tomate("Tomate Americano", 10);
        tomate.setDataValidade("10/12/2022");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("#################################");
        CalculadoraImposto.calcularImposto(produto);


    }
}
