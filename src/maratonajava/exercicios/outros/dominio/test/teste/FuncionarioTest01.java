package maratonajava.exercicios.outros.dominio.test.teste;

import maratonajava.exercicios.outros.dominio.classes.Funcionario;


public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();


        funcionario.setNome("Naruto");
        funcionario.setIdade(27);
        funcionario.setSalarios(new double[]{1425.00, 1254.88, 2132.11});


        funcionario.imprimir();
        funcionario.mediaSalario();

    }
}
