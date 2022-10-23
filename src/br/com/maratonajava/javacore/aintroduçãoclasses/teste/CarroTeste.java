package br.com.maratonajava.javacore.aintroduçãoclasses.teste;

import br.com.maratonajava.javacore.aintroduçãoclasses.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.ano = 2022;
        carro1.nome = "ix35";
        carro1.modelo = "SUV";

        carro2.modelo = "Bolinha";
        carro2.nome = "Gol";
        carro2.ano = 2000;

        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);
        System.out.println("\n ----------------");
        System.out.println("\n"+ carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
