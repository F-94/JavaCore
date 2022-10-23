package br.com.maratonajava.javacore.jmodificadorfinal.teste;

import br.com.maratonajava.javacore.jmodificadorfinal.dominio.Carro;

public class ModificadorFinalTeste {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(carro.COMPRADOR);
        System.out.println(Carro.VELOCIDADE_LIMITE);
        carro.COMPRADOR.setNome("Cido");
        System.out.println(carro.COMPRADOR);

    }
}
