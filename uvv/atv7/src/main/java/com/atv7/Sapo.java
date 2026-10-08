package com.atv7;

public class Sapo extends Animal implements Nadar, Andar {

    private final String tipoVeneno;

    public Sapo(String nome, double peso, String tipoVeneno) {
        super(nome, peso, "Florestas e brejos");
        this.tipoVeneno = tipoVeneno;
    }

    public String getTipoVeneno() {
        return tipoVeneno;
    }

    @Override
    public void emitirSom() {
        System.out.println("COAX COAX COAX");
    }

    @Override
    public void alimentar() {
        System.out.println("O sapo dispara a língua para capturar insetos no ar.");
    }

    @Override
    public void nadar(String local) {
        System.out.println("O sapo nada com as patas traseiras em " + local + ".");
    }

    @Override
    public void mergulhar(int profundidade) {
        System.out.println("O sapo mergulha a " + profundidade + " metros para se esconder.");
    }

    @Override
    public void emergir() {
        System.out.println("O sapo emerge e salta para uma pedra próxima.");
    }

    @Override
    public void andar(int velocidade) {
        System.out.println("O sapo salta lentamente pela floresta na velocidade " + velocidade + ".");
    }

    @Override
    public void correr(int velocidade) {
        System.out.println("O sapo usa o veneno e foge saltando rapidamente na velocidade " + velocidade + ".");
    }

    @Override
    public void parar() {
        System.out.println("O sapo para imóvel e se camufla entre as folhas.");
    }
}
