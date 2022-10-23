package br.com.maratonajava.javacore.gassociacao.exercicio.dominio;

public class Professor {
    private String nome;
    private String especialidade;

    private Seminario[] seminarios;

    public Professor(String nome, String especialidade, Seminario[] seminario) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminario;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }
    public void imprime(){
        System.out.println("Professor: "+ this.nome);
        if(this.seminarios == null) return;
        System.out.println("### Seminarios Cadastrados ###");
        for (Seminario seminario: this.seminarios ){
            System.out.println(seminario.getTitulo());
            System.out.println("### Endereço ###");
            System.out.println(seminario.getLocal().getEndereco());
            if(seminario.getAlunos() == null || seminario.getAlunos().length ==0) continue;
            System.out.println("### Alunos ###");
            for (Aluno aluno: seminario.getAlunos()){
                System.out.println("Aluno: " + aluno.getNome()+ " idade: " + aluno.getIdade());
            }
        }

    }

    public Professor(String nome) {
        this.nome = nome;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
