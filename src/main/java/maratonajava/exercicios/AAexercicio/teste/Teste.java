package maratonajava.exercicios.AAexercicio.teste;

public class Teste {
    public static void main(String[] args) {
        final int X = 7;
        int [][] a = {{5,4,3}, {9,7,2}, {1,6,8}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] == X) break;
                System.out.println(a[i][j]);

            }

        }
    }
}
