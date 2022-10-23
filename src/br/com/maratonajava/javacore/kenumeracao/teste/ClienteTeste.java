package br.com.maratonajava.javacore.kenumeracao.teste;

import br.com.maratonajava.javacore.kenumeracao.dominio.Cliente;
import br.com.maratonajava.javacore.kenumeracao.dominio.TipoCliente;
import br.com.maratonajava.javacore.kenumeracao.dominio.TipoPagamento;
import org.w3c.dom.ls.LSOutput;


public class ClienteTeste {


    public static void main(String[] args) {

        Cliente c1 = new Cliente("Tadeu", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente c2 = new Cliente("Marta", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(c1 + " " + c2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(300));


        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Juridica");
        System.out.println(tipoCliente2);
    }
}
