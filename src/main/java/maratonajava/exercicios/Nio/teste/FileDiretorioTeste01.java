package maratonajava.exercicios.Nio.teste;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDiretorioTeste01 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");
        boolean createFileDiretorio = fileDiretorio.mkdir();
        System.out.println(createFileDiretorio);
        File fileArquivo = new File(fileDiretorio,"texto.txt");
        boolean createNewFile = fileArquivo.createNewFile();
        System.out.println(createNewFile);




    }
}
