package br.com.maratonajava.introducao.estruturascondicionais;

public class OperadorTernario {
    public static void main(String[] args) {
        double salario = 900;
        String mensagemDoar = "Eu vou doar";
        String naoDoar = "Ainda não tenho condições de doar, mas vou ter!!";
        String resultado =  salario>1000 ? mensagemDoar : naoDoar;
        System.out.println(resultado);
    }
}
