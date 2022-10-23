package br.com.maratonajava.javacore.heranca.teste;

import br.com.maratonajava.javacore.heranca.dominio.Endereco;
import br.com.maratonajava.javacore.heranca.dominio.Funcionario;
import br.com.maratonajava.javacore.heranca.dominio.Pessoa;

public class HerancaTeste {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setCep("12345-258");
        endereco.setRua("Rua das graças");

        Pessoa pessoa = new Pessoa("Mario");

        pessoa.setCpf("112345698-78");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Tobias");


        funcionario.setEndereco( endereco);
        funcionario.setCpf("222222222-22");
        funcionario.setSalario(2000.00);
        System.out.println("---------");
        funcionario.imprime();

    }
}
