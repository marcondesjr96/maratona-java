package maratonajava.exercicios.outros.dominio.exercicios.testes;

import maratonajava.exercicios.outros.dominio.exercicios.dominios.associacao.Aluno;
import maratonajava.exercicios.outros.dominio.exercicios.dominios.associacao.Local;
import maratonajava.exercicios.outros.dominio.exercicios.dominios.associacao.Professor;
import maratonajava.exercicios.outros.dominio.exercicios.dominios.associacao.Seminario;

public class ExercicioMaratonaJavaAssociacao {
    public static void main(String[] args) {
        Local local = new Local("Rua Barreiros, n 67");
        Aluno aluno1 = new Aluno("Pedro", 18);
        Aluno aluno2 = new Aluno("Tiago", 21);
        Aluno[] alunos = new Aluno[]{aluno1, aluno2};
        Professor professor1 = new Professor("Sr Neto", "Matematica");
        Professor professor2 = new Professor("Sr Luiz", "Portugues");
        Professor[] professores = {professor1, professor2};
        Seminario seminario = new Seminario("Como aprender Back end", alunos, local);
        Seminario seminario2 = new Seminario("Como aprender Front end", alunos, local);
        Seminario seminario3 = new Seminario("Como aprender Full Stack", alunos, local);
        Seminario[] seminariosDisponiveis = new Seminario[]{seminario, seminario2};
        Seminario[] seminariosDisponiveis2 = new Seminario[]{seminario, seminario3};
        professor1.setSeminarios(seminariosDisponiveis);
        professor2.setSeminarios(seminariosDisponiveis2);

        professor1.imprimi();



    }
}
