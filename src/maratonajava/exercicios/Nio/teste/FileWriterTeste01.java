package maratonajava.exercicios.Nio.teste;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTeste01 {
    public static void main(String[] args) {
        File file = new File("text.txt");

        try (FileWriter fileWriter = new FileWriter(file)) {

            fileWriter.write("Testando a Biblioteca io FileWriter, no Java!!\n");
            fileWriter.flush();

        } catch (IOException e) {

            throw new RuntimeException(e);
        }
    }
}
