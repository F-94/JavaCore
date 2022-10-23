package br.com.maratonajava.javacore.npolimofismo.teste;

import br.com.maratonajava.javacore.npolimofismo.repositorio.Repositorio;
import br.com.maratonajava.javacore.npolimofismo.servico.RepositorioArquivo;

public class RepositorioTeste {
    public static void main(String[] args) {

        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();
    }
}