package br.com.maratonajava.javacore.bintroducaometodos.teste;

import br.com.maratonajava.javacore.bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Muller");
        funcionario.setIdade(28);
        funcionario.setSalarios(new double[]{4000, 5000, 3000});

        funcionario.imprime();

    }
}
