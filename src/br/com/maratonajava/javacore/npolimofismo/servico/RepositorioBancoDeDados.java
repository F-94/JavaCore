package br.com.maratonajava.javacore.npolimofismo.servico;

import br.com.maratonajava.javacore.npolimofismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("salvando em banco de dados");

    }
}
