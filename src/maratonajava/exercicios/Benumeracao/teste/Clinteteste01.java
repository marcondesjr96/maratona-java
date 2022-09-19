package maratonajava.exercicios.Benumeracao.teste;

import maratonajava.exercicios.Benumeracao.dominio.Cliente;
import maratonajava.exercicios.Benumeracao.dominio.TipoCliente;
import maratonajava.exercicios.Benumeracao.dominio.TipoPagamento;

public class Clinteteste01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Junior", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Junior", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);


        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));




    }
}
