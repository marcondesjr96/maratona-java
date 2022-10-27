package maratonajava.exercicios.Fpolimorfismo.servico;

import maratonajava.exercicios.Fpolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um Arquivo");
    }
}
