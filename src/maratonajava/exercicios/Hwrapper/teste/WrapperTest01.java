package maratonajava.exercicios.Hwrapper.teste;

public class WrapperTest01 {
    public static void main(String[] args) {

        //TIPOS PRIMITIVOS
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 1l;
        float floatP = 1f;
        double doubleP = 1d;
        char charP = 'A';
        boolean booleanP = false;

        //TIPOS WRAPPER
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; //autoboxing || boxing
        Long longW = 1l;
        Float floatW = 1f;
        Double doubleW = 1d;
        Character charW = 'A';
        Boolean booleanW = false;

        int i = intW; //unboxing
        Integer intW2 = Integer.parseInt("2");
        Double doubleW2 = Double.parseDouble("231");

        System.out.println(Character.isDigit('1'));
        System.out.println(Character.isUpperCase('S'));
        System.out.println(Character.toUpperCase('s'));

    }
}
