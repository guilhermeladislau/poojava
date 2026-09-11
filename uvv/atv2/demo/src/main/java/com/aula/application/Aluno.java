package com.aula.application;

public class Aluno {
    private String nome;
    private int matricula;
    private Curso curso;

    public Aluno() {
    }

    public Aluno(String nome, int matricula, Curso curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }
public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    

}
