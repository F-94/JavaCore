package br.com.maratonajava.javacore.fmodificadorestatico.teste;

import br.com.maratonajava.javacore.fmodificadorestatico.dominio.Carro;

public class Carroteste {
    public static void main(String[] args) {

        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 290);

        Carro.setVelocidadeLimite(160);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}