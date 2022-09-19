package maratonajava.exercicios.Fpolimorfismo.servico;

import maratonajava.exercicios.Fpolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em Memoria");
    }
}
