package maratonajava.exercicios.Gexception.runtime.test;

public class RunTimeExceptionTest04 {
    public static void main(String[] args) {

        try {

            throw new ArrayIndexOutOfBoundsException();

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Dentro de ArrayIndexOutOfBoundsException");
            e.printStackTrace();

        } catch (ArithmeticException e) {

            System.out.println("Dentro de ArithmeticException");

        } catch (TypeNotPresentException e) {

            System.out.println("Dentro de ArithmeticException");

        } catch (RuntimeException e) {

            System.out.println("Dentro de RuntimeException");
        }
    }
}
