package com.atv7;

public class Pato extends Animal implements Voar, Nadar, Andar {

    public Pato(String nome, double peso) {
        super(nome, peso, "Lagos e banhados");
    }

    @Override
    public void emitirSom() {
        System.out.println("QUACK QUACK QUACK");
    }

    @Override
    public void alimentar() {
        System.out.println("O pato filtra água com o bico em busca de algas e insetos.");
    }

    @Override
    public void decolar() {
        System.out.println("O pato bate as asas e decola da superfície da água.");
    }

    @Override
    public void voar(String destino) {
        System.out.println("O pato voa em formação migratória rumo a " + destino + ".");
    }

    @Override
    public void pousar() {
        System.out.println("O pato desce e desliza sobre a superfície do lago.");
    }

    @Override
    public void nadar(String local) {
        System.out.println("O pato nada tranquilamente em " + local + ".");
    }

    @Override
    public void mergulhar(int profundidade) {
        System.out.println("O pato mergulha superficialmente a " + profundidade + " metros.");
    }

    @Override
    public void emergir() {
        System.out.println("O pato emerge sacudindo as penas.");
    }

    @Override
    public void andar(int velocidade) {
        System.out.println("O pato caminha bambolejando pela margem na velocidade " + velocidade + ".");
    }

    @Override
    public void correr(int velocidade) {
        System.out.println("O pato corre batendo as asas na velocidade " + velocidade + ".");
    }

    @Override
    public void parar() {
        System.out.println("O pato para na beira do lago e sacode as penas.");
    }
}
