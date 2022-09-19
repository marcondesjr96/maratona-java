package maratonajava.exercicios.Gexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {

        createNewFile();

    }

    public static void createNewFile(){

        File file = new File("file\\test3.txt");
        try{
            boolean isCreate = file.createNewFile();
            System.out.println("Create file " +isCreate);

        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
