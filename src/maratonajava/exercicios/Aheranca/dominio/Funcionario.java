package maratonajava.exercicios.Aheranca.dominio;

public class Funcionario extends Pessoa {

    private double salario;

    public void imprime() {
        super.imprime();
        System.out.println("Salario: " + this.salario);
    }
    public void relatorio(){

    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
