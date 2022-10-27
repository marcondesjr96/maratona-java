package maratonajava.exercicios.Gexception.exception.test;

import maratonajava.exercicios.Gexception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {

        try {
            Logar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }

    }

    private static void Logar() throws LoginInvalidoException {
        Scanner ler = new Scanner(System.in);
        String username = "Shaco";
        String password = "lol123";
        System.out.println("Usuario");
        String usernameLer = ler.nextLine();
        System.out.println("Senha");
        String passwoordLer = ler.nextLine();
        if (!username.equals(usernameLer) || !password.equals(passwoordLer)) {
            throw new LoginInvalidoException("Dados Invalidos");

        }
        System.out.println("Login Efetuado com sucesso");

    }
}

