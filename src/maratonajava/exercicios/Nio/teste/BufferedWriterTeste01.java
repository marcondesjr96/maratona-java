package maratonajava.exercicios.Nio.teste;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTeste01 {
    public static void main(String[] args) {
        File file = new File("text.txt");

        try (FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw)) {

            bw.write("Testando a Biblioteca io FileWriter, no Java!!");
            bw.newLine();
            bw.flush();

            }catch (IOException e){

            e.printStackTrace();
        }
    }
}
