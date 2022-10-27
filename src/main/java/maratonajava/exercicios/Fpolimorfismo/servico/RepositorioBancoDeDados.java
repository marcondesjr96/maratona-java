package maratonajava.exercicios.Fpolimorfismo.servico;

import maratonajava.exercicios.Fpolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um banco de Dados");
    }
}
