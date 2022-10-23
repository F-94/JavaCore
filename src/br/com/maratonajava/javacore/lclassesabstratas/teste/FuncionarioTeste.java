package br.com.maratonajava.javacore.lclassesabstratas.teste;

import br.com.maratonajava.javacore.lclassesabstratas.dominio.Desenvolvedor;
import br.com.maratonajava.javacore.lclassesabstratas.dominio.Gerente;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 2500);
        System.out.println(gerente);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Gajo", 5000);
        System.out.println(desenvolvedor);
    }

}
