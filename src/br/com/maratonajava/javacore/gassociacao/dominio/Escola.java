package br.com.maratonajava.javacore.gassociacao.dominio;

public class Escola {
    private String nome;
    private Professor [] professores;

    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Professor[] professores) {
        this(nome);
        this.professores = professores;
    }

    public void imprime(){
        System.out.println("Escola " + this.nome);
        if (professores==null) return;
            for(Professor professor : professores){
                System.out.println("Professor " + professor.getNome());
            }
        }
    }
