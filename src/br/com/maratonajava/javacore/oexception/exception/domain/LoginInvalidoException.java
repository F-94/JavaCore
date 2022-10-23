package br.com.maratonajava.javacore.oexception.exception.domain;

public class LoginInvalidoException extends Exception{
    public LoginInvalidoException() {
        super("login inválido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
