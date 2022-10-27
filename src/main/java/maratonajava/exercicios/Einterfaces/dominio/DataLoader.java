package maratonajava.exercicios.Einterfaces.dominio;

public interface DataLoader {
    void load();
    public static final int MAX_DATA_SIZE = 10;
    default void checkPermission(){
        System.out.println("Fazendo Checagem de permissões");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
