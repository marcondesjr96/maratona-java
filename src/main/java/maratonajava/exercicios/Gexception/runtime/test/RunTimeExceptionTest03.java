package maratonajava.exercicios.Gexception.runtime.test;

public class RunTimeExceptionTest03 {
    public static void main(String[] args) {
        System.out.println(openConnection());
    }

    private static String openConnection() {
        try {
            System.out.println("Opening file");
            System.out.println("Write date in file");

            return "Open Connection";
        }catch (Exception e){
            e.printStackTrace();

        }finally {
            System.out.println("Closing file");
        }
        return null;
    }
}
