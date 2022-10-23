package br.com.maratonajava.javacore.gassociacao.teste;

import br.com.maratonajava.javacore.gassociacao.dominio.Escola;
import br.com.maratonajava.javacore.gassociacao.dominio.Professor;

public class UnidirecionalMuitosParaUmTeste {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Luiz");
        Professor professor2 = new Professor("Carlos");
        Professor [] professores = {professor1, professor2};
        Escola escola = new Escola("Cedom",professores);
        escola.imprime();
    }
}
