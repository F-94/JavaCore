package br.com.maratonajava.javacore.gassociacao.exercicio.teste;

import br.com.maratonajava.javacore.gassociacao.exercicio.dominio.Aluno;
import br.com.maratonajava.javacore.gassociacao.exercicio.dominio.Local;
import br.com.maratonajava.javacore.gassociacao.exercicio.dominio.Professor;
import br.com.maratonajava.javacore.gassociacao.exercicio.dominio.Seminario;

public class SeminarioTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua da graça");
        Aluno aluno = new Aluno("Paulo", 17);
        Professor professor = new Professor("Carlos", "Fisica");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Fisica Quantica", alunosParaSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);
        professor.imprime();
    }
}
