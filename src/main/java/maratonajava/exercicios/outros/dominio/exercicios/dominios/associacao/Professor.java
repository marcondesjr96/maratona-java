package maratonajava.exercicios.outros.dominio.exercicios.dominios.associacao;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;


    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprimi() {
        System.out.println("Professor: " + this.nome);
        System.out.println("Sua Especialidade e: " + this.especialidade);
        if (seminarios == null) return;
        System.out.println("Seminarios disponiveis: ");
        for (Seminario seminario : this.seminarios) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereco());
            System.out.println("Aluno: ");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println(aluno.getNome() + " idade " + aluno.getIdade());


            }

        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
