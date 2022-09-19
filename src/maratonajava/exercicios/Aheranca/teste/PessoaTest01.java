package maratonajava.exercicios.Aheranca.teste;

import maratonajava.exercicios.Aheranca.dominio.Endereco;
import maratonajava.exercicios.Aheranca.dominio.Funcionario;
import maratonajava.exercicios.Aheranca.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua barreiros");
        endereco.setCep(53635095);
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Junior");
        pessoa1.setCpf("09954811486");
        pessoa1.setEndereco(endereco);

        pessoa1.imprime();
        System.out.println("---------------------------------");

        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Fabricio");
        funcionario1.setCpf("1234567890");
        funcionario1.setEndereco(endereco);
        funcionario1.setSalario(201454);

        funcionario1.imprime();


    }
}
