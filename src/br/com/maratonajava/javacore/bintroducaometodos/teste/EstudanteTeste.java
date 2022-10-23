package br.com.maratonajava.javacore.bintroducaometodos.teste;

import br.com.maratonajava.javacore.bintroducaometodos.dominio.Estudante;
import br.com.maratonajava.javacore.bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.idade = 18;
        estudante.nome = "João";
        estudante.sexo = 'M';

        estudante2.nome = "Maria";
        estudante2.idade = 33;
        estudante2.sexo = 'F';

        ImpressoraEstudante impressora = new ImpressoraEstudante();

        impressora.imprime(estudante);
        impressora.imprime(estudante2);

        estudante.imprime();
        estudante2.imprime();

    }

}
