package com.atv7;

public abstract class Animal {

    private final String nome;
    private final double peso;
    private final String habitat;

    protected Animal(String nome, double peso, String habitat) {
        this.nome = nome;
        this.peso = peso;
        this.habitat = habitat;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public String getHabitat() {
        return habitat;
    }

    public void exibirFicha() {
        System.out.printf("Nome: %s%nPeso: %.2f kg%nHabitat: %s%n", nome, peso, habitat);
    }

    public abstract void emitirSom();

    public abstract void alimentar();
}
