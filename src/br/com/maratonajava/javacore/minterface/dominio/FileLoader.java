package br.com.maratonajava.javacore.minterface.dominio;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println(" carregando dados de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println(" deletando dados de um arquivo");
    }

    @Override
    public void checkPermission() {
        System.out.println(" checando permissões no arquivo");
    }
}
