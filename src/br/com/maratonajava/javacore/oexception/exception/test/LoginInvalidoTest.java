package br.com.maratonajava.javacore.oexception.exception.test;

import br.com.maratonajava.javacore.oexception.exception.domain.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoTest {
    public static void main(String[] args) {
        try {
            logar();
        }catch (LoginInvalidoException e){
            e.printStackTrace();
        }

    }
    private static void logar() throws LoginInvalidoException {
        Scanner sc = new Scanner(System.in);
String user = "felipe";
String senha = "ssj";
        System.out.println("User");
        String userDigitado = sc.nextLine();
        System.out.println("Password");
        String senhaDigitada = sc.nextLine();
        if (!user.equals(userDigitado) || !senha.equals(senhaDigitada)){
            throw new LoginInvalidoException("Usuario ou senha inválido");

        }
        System.out.println("Logado com sucesso");
    }
}
