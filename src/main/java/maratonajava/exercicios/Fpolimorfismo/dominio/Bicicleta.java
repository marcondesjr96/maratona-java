package maratonajava.exercicios.Fpolimorfismo.dominio;

public class Bicicleta extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.34;

    public Bicicleta(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto da Bicicleta");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
