package br.com.maratonajava.javacore.minterface.teste;

import br.com.maratonajava.javacore.minterface.dominio.DataBaseLoader;
import br.com.maratonajava.javacore.minterface.dominio.DataLoader;
import br.com.maratonajava.javacore.minterface.dominio.FileLoader;

public class DataLoaderTest {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataBaseLoader.load();
        fileLoader.load();
        dataBaseLoader.remove();
        fileLoader.remove();
        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();
        DataBaseLoader.retrieveMaxDataSize();
        DataLoader.retrieveMaxDataSize();
    }
}
