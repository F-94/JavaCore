package br.com.maratonajava.javacore.npolimofismo.servico;

import br.com.maratonajava.javacore.npolimofismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("salvando em memoria");

    }
}
