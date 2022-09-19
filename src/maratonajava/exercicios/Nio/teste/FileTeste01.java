package maratonajava.exercicios.Nio.teste;

import java.io.File;
import java.io.IOException;

public class FileTeste01 {
    public static void main(String[] args) {
        File file = new File("text.txt");

        try {
            boolean newFile = file.createNewFile();
            System.out.println("Creadted " + newFile);
            System.out.println("path absolute: " + file.getAbsolutePath());

            if (file.exists()) {
                boolean delete = file.delete();
                System.out.println("Deleted: "+delete);

            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
