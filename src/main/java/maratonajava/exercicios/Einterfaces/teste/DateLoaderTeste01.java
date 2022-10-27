package maratonajava.exercicios.Einterfaces.teste;

import maratonajava.exercicios.Einterfaces.dominio.DataLoader;
import maratonajava.exercicios.Einterfaces.dominio.DatabaseLoader;
import maratonajava.exercicios.Einterfaces.dominio.FileLoader;

public class DateLoaderTeste01{
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();
        databaseLoader.remove();
        fileLoader.remove();
        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();


    }
}
