package com.example;

public class Main {
    public static void main(String[] args) {

        Curso c1 = new Curso("CC3N", "Ciência da Computação");
        Aluno a1 = new Aluno("João", 12345, c1);

        System.out.println("Aluno: " + a1.getNome() + ", Matrícula: " + a1.getMatricula() + ", Curso: " + a1.getCurso().getNome());
    }
}