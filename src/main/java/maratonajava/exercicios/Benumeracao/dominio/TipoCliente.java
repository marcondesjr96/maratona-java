package maratonajava.exercicios.Benumeracao.dominio;

public enum TipoCliente {
    PESSOA_JURIDICA(1),
    PESSOA_FISICA(2);

    public final int VALOR;

    TipoCliente(int valor) {
        this.VALOR = valor;
    }

    public int getValor() {
        return VALOR;
    }
}
