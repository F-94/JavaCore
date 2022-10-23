package br.com.maratonajava.javacore.heranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;
public Funcionario(String nome){
    super(nome);
}
    @Override
    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }
    public void relatorioPagamento(){
        System.out.println("Eu " + this.nome + " recebi o salario " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
