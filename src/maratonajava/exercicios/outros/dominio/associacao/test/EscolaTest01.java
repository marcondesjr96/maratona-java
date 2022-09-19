package maratonajava.exercicios.outros.dominio.associacao.test;

import maratonajava.exercicios.outros.dominio.associacao.dominio.Escola;
import maratonajava.exercicios.outros.dominio.associacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {

        Professor professor1 = new Professor("Paulo");
        Professor professor2 = new Professor("Sergio");
        Professor professor3 = new Professor("André");
        Professor[] professores = new Professor[]{professor1, professor2, professor3};
        Escola escola = new Escola("Brasilino", professores);

        escola.imprimi();

    }
}
