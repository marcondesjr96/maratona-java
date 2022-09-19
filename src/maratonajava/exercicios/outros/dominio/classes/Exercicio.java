package maratonajava.exercicios.outros.dominio.classes;

public class Exercicio {

    private String nome;
    private int idade;
    private double salario;
    private int amigos;

    public void dizerInformacao (String nome, int idade, double salario){

        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public void dizerInformacao (){
        this.dizerInformacao(nome, idade, salario);
        this.amigos = amigos;


    }





    public void imprimir (){
        System.out.println(this.nome);
        System.out.println(this.idade + " anos");
        System.out.println("R$ " + this.salario);
        System.out.println(this.amigos + " amigos");
    }

    public int getAmigos() {
        return amigos;
    }

    public void setAmigos(int amigos) {
        this.amigos = amigos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
