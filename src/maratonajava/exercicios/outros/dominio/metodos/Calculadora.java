package maratonajava.exercicios.outros.dominio.metodos;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 20);
    }

    public void subtracaoDoisNumeros(int n1, int n2) {
        System.out.println(n1 - n2);
    }

    public int subtracaoDoisNumeros02(int n1, int n2) {
        if (n1 > 0) {
            return n1 + n2;


        } else {
            return n1 - n2;
        }
    }
}
