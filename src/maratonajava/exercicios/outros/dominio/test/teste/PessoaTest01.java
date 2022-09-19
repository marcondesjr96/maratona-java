package maratonajava.exercicios.outros.dominio.test.teste;

import maratonajava.exercicios.outros.dominio.classes.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Bruce Lee");
        pessoa.setIdade(39);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
