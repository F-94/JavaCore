package br.com.maratonajava.javacore.oexception.exception.test;

import br.com.maratonajava.javacore.oexception.exception.domain.Funcionario;
import br.com.maratonajava.javacore.oexception.exception.domain.LoginInvalidoException;
import br.com.maratonajava.javacore.oexception.exception.domain.Pessoa;

public class SobrescritaExceptionTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Funcionario f = new Funcionario();
        try {
            f.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
}
