package maratonajava.exercicios.outros.dominio.test.teste;

import maratonajava.exercicios.outros.dominio.classes.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {

        Estudante estudante11 = new Estudante();
        Estudante estudanteNovato = new Estudante();

        estudante11.nome = "Goku";
        estudante11.sexo = 'M';
        estudante11.idade = 30;

        estudanteNovato.nome = "Vedita";
        estudanteNovato.sexo = 'M';
        estudanteNovato.idade = 25;

        estudante11.imprimir();
        estudanteNovato.imprimir();






    }
}
