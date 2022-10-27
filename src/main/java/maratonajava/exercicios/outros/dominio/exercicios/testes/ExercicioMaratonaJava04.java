package maratonajava.exercicios.outros.dominio.exercicios.testes;

public class ExercicioMaratonaJava04 {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];

        dias[0][0] = 30;
        dias[0][1] = 29;
        dias[0][2] = 28;

        dias[1][0] = 27;
        dias[1][1] = 26;
        dias[1][2] = 25;

        dias[2][0] = 24;
        dias[2][1] = 23;
        dias[2][2] = 22;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);

            }
            System.out.println("------------------------------------------------------");

            for (int[] arrBase : dias) {
                for (int num : arrBase) {
                    System.out.println(num);
                }

            }

        }


    }
}
