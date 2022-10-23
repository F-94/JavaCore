package br.com.maratonajava.javacore.minterface.dominio;

public class DataBaseLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println(" carregando dados do banco de dados");


    }

    @Override
    public void remove() {
        System.out.println(" removendo dados do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println(" checando permissão do banco de dados");
    }
    public static void retrieveMaxDataSize(){
        System.out.println(" dentro do retrieveMaxDataSize no DataBaseLoader");
    }
}
