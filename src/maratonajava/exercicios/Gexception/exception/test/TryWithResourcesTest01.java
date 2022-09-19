package maratonajava.exercicios.Gexception.exception.test;

import maratonajava.exercicios.Gexception.dominio.Leitor1;
import maratonajava.exercicios.Gexception.dominio.Leitor2;

import java.io.IOException;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        LerAquivo();

    }
    public static void LerAquivo(){
        try(Leitor1 leitor1 = new Leitor1(); Leitor2 leitor2 = new Leitor2()){

        }catch (IOException e){

        }
    }
}
