package maratonajava.exercicios.Dmodificadorfinal.dominio;

public class Comprador {
    private String nome;
    private int idade;

    @Override
    public String toString() {
        return "Comprador{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
