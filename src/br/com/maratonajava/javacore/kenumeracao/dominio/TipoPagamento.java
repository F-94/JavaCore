package br.com.maratonajava.javacore.kenumeracao.dominio;

public enum TipoPagamento {
    DEBITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    },
    CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.15;
        }
    };

    public abstract double calcularDesconto(double valor);

    }