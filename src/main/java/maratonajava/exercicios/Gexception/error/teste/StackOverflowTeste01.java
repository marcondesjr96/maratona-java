package maratonajava.exercicios.Gexception.error.teste;

public class StackOverflowTeste01 {
    public static void main(String[] args) {

        recursivo();


    }

    public static void recursivo(){
        recursivo();
    }
}
