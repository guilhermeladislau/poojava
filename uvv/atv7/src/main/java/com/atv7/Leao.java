package com.atv7;

public class Leao extends Animal implements Andar {

    private final String alcunha;

    public Leao(String nome, double peso, String alcunha) {
        super(nome, peso, "Savana africana");
        this.alcunha = alcunha;
    }

    public String getAlcunha() {
        return alcunha;
    }

    @Override
    public void emitirSom() {
        System.out.println("ROAAARRR");
    }

    @Override
    public void alimentar() {
        System.out.println("O leão caça em grupo e consome a presa.");
    }

    @Override
    public void andar(int velocidade) {
        System.out.println("O leão caminha pela savana na velocidade " + velocidade + ".");
    }

    @Override
    public void correr(int velocidade) {
        System.out.println("O leão dispara em perseguição na velocidade máxima de " + velocidade + ".");
    }

    @Override
    public void parar() {
        System.out.println("O leão para, espreita e observa a presa ao longe.");
    }
}
