package maratonajava.exercicios.Fpolimorfismo.teste;

import maratonajava.exercicios.Fpolimorfismo.repositorio.Repositorio;
import maratonajava.exercicios.Fpolimorfismo.servico.RepositorioArquivo;
import maratonajava.exercicios.Fpolimorfismo.servico.RepositorioBancoDeDados;
import maratonajava.exercicios.Fpolimorfismo.servico.RepositorioMemoria;

public class RepositorioTeste01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
        Repositorio repositorio1 = new RepositorioArquivo();
        repositorio1.salvar();
        Repositorio repositorio2 = new RepositorioMemoria();
        repositorio2.salvar();
    }
}
 