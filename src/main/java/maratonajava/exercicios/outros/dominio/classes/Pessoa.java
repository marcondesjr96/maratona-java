package maratonajava.exercicios.outros.dominio.classes;

public class Pessoa {

    private String nome;
    private int idade;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void imprimi (){
        System.out.println(this.idade);
        System.out.println(this.nome);
    }

    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }

}
