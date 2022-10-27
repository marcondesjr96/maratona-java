package maratonajava.exercicios.Fpolimorfismo.servico;

import maratonajava.exercicios.Fpolimorfismo.dominio.Produto;
import maratonajava.exercicios.Fpolimorfismo.dominio.Tomate;

public class CalculadoraImposto {


    public static void calcularImposto(Produto produto) {
        System.out.println("Relatorio de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("imposto a ser pago: " + imposto);
        if (produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
        }

    }
}
