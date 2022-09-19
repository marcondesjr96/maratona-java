package maratonajava.exercicios.outros.dominio.classes;

public class Estudante {

    public String nome;
    public int idade;
    public char sexo;
    public String saga = "Saga: Dragon Ball Z";

    public void imprimir (){
        System.out.println("___________________________");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
        System.out.println(this.saga);
    }



}

