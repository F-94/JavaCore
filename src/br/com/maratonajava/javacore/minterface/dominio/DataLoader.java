package br.com.maratonajava.javacore.minterface.dominio;

public interface DataLoader {
   public static final int MAX_DATA_SIZE = 10;
    public abstract void load();
    default void checkPermission(){
        System.out.println("checando permissões");
    }
    public static void retrieveMaxDataSize(){
        System.out.println(" dentro do retrieveMaxDataSize na interface");
    }
}
