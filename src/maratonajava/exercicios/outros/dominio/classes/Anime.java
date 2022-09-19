package maratonajava.exercicios.outros.dominio.classes;

public class Anime {

    private String nome;
    private String genero;
    private int episodios;
    private int numeroDePersonagens;
    private double valorDoAnime;




    public void init (String nome, String genero, int episodios, int numeroDePersonagens) {
        this.nome = nome;
        this.genero = genero;
        this.episodios = episodios;
        this.numeroDePersonagens = numeroDePersonagens;

    }

    public void init (String nome, String genero, int episodios, int numeroDePersonagens, double valorDoAnime){
        this.init(nome, genero, episodios, numeroDePersonagens);
        this.valorDoAnime = valorDoAnime;
    }

    public void imprimir (){

        System.out.println(this.nome);
        System.out.println(this.genero);
        System.out.println(this.episodios);
        System.out.println(this.numeroDePersonagens);
        System.out.println(this.valorDoAnime);
    }

    public double getValorDoAnime() {
        return valorDoAnime;
    }

    public void setValorDoAnime(double valorDoAnime) {
        this.valorDoAnime = valorDoAnime;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getNumeroDePersonagens() {
        return numeroDePersonagens;
    }

    public void setNumeroDePersonagens(int numeroDePersonagens) {
        this.numeroDePersonagens = numeroDePersonagens;
    }
}
