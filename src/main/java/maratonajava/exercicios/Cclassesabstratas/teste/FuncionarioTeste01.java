package maratonajava.exercicios.Cclassesabstratas.teste;

import maratonajava.exercicios.Cclassesabstratas.dominio.Desenvolvedor;
import maratonajava.exercicios.Cclassesabstratas.dominio.Funcionario;
import maratonajava.exercicios.Cclassesabstratas.dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {

        Gerente gerente1 = new Gerente("Shaco", 7400);
        System.out.println(gerente1);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Darius", 14000);
        System.out.println(desenvolvedor);
        desenvolvedor.imprime();
        gerente1.imprime();


    }
}
