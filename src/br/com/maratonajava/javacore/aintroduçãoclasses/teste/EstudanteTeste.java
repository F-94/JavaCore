package br.com.maratonajava.javacore.aintroduçãoclasses.teste;

import br.com.maratonajava.javacore.aintroduçãoclasses.dominio.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.idade = 18;
        estudante.nome = "João";
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }

}
