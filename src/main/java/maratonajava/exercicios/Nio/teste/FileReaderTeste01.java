package maratonajava.exercicios.Nio.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTeste01 {
    public static void main(String[] args) {
        File file = new File("text.txt");
        try (FileReader fileReader = new FileReader(file)){

            int i;
            while ((i=fileReader.read()) > 0){
                System.out.print((char) i);
            }

        }catch (IOException e){

            e.printStackTrace();
        }
    }
}
