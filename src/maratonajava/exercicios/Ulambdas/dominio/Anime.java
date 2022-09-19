package maratonajava.exercicios.Ulambdas.dominio;

public class Anime {

    private String title;
    private int epsidoes;

    public Anime(String title, int epsidoes) {
        this.title = title;
        this.epsidoes = epsidoes;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", epsidoes=" + epsidoes +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public int getEpsidoes() {
        return epsidoes;
    }
}
