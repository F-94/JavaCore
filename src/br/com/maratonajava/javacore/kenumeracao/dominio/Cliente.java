package br.com.maratonajava.javacore.kenumeracao.dominio;

public class Cliente {

    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente= " + tipoCliente.getNomeRelatorio()+
                ", tipoCliente= " + tipoCliente.getValor()+
                ", tipoPagamento= " + tipoPagamento +
                '}';
    }

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }
}