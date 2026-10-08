package com.atv7;

public class Golfinho extends Animal implements Nadar {

    private final String especie;

    public Golfinho(String nome, double peso, String especie) {
        super(nome, peso, "Oceanos e mares tropicais");
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    @Override
    public void emitirSom() {
        System.out.println("CLIC CLIC CLIC - ecolocalização ativa.");
    }

    @Override
    public void alimentar() {
        System.out.println("O golfinho usa a ecolocalização para localizar e engolir peixes.");
    }

    @Override
    public void nadar(String local) {
        System.out.println("O golfinho nada velozmente em " + local + ".");
    }

    @Override
    public void mergulhar(int profundidade) {
        System.out.println("O golfinho mergulha a " + profundidade + " metros de profundidade.");
    }

    @Override
    public void emergir() {
        System.out.println("O golfinho salta acima da superfície ao emergir.");
    }
}
