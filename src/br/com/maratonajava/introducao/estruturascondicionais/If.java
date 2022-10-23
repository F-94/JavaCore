package br.com.maratonajava.introducao.estruturascondicionais;

public class If {
    public static void main(String[] args) {
        int idade  = 15;
        boolean isAutorizadoComprarBebida = idade>=18;
        if (!isAutorizadoComprarBebida) {
            System.out.println("Não autorizado a comprar");
        }
        System.out.println("fora do if");
    }
}
