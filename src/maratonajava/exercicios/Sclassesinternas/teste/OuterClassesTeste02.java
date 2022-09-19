package maratonajava.exercicios.Sclassesinternas.teste;

public class OuterClassesTeste02 {
    private String name = "Midoriya";

    void print(){
        class LocalClass{
            public void printLocal(){
                System.out.println(name);
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.printLocal();

    }

    public static void main(String[] args) {
        OuterClassesTeste02 outer = new OuterClassesTeste02();
        outer.print();

    }
}
