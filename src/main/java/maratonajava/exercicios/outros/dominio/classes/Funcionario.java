package maratonajava.exercicios.outros.dominio.classes;

import java.text.DecimalFormat;

public class Funcionario {

    private String nome;
    private int idade;
    private double [] salarios;
    double result = 0;


    public void imprimir() {

        System.out.println("-----------------------------------------");
        System.out.println(this.nome);
        System.out.println(this.idade + " anos");
        for (double salario : salarios){
            System.out.print("R$ " + salario + " // ");
        }

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

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public void mediaSalario() {

        DecimalFormat formatador = new DecimalFormat("0.00");


        for(double salario :salarios){
            result += salario;

        }

        result /= salarios.length;

        System.out.println("Media do salario eh " + formatador.format(result));






    }

}
