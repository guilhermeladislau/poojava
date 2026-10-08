package com.atv7;

import java.util.ArrayList;
import java.util.List;

public class ReinoAnimal {

    public static void separador(String titulo) {
        System.out.println();
        System.out.println("========================================");
        System.out.println(titulo);
        System.out.println("========================================");
    }

    public static void main(String[] args) {
        Aguia aguia = new Aguia("Águia", 5.2, 2.4);
        Golfinho golfinho = new Golfinho("Golfinho", 120.0, "Tursiops truncatus");
        Leao leao = new Leao("Leão", 180.0, "Rei da Savana");
        Pato pato = new Pato("Pato", 2.1);
        Sapo sapo = new Sapo("Sapo", 0.8, "Neurotóxico");

        List<Animal> animais = new ArrayList<>(List.of(aguia, golfinho, leao, pato, sapo));

        separador("Fichas dos animais");
        for (Animal animal : animais) {
            animal.exibirFicha();
            System.out.println();
        }

        separador("Polimorfismo - emitirSom");
        for (Animal animal : animais) {
            animal.emitirSom();
        }

        separador("Polimorfismo - alimentar");
        for (Animal animal : animais) {
            animal.alimentar();
        }

        separador("Polimorfismo por interface - Voar");
        List<Voar> voadores = new ArrayList<>(List.of(aguia, pato));
        for (Voar voador : voadores) {
            voador.decolar();
            voador.voar("noroeste");
            voador.pousar();
        }

        separador("Polimorfismo por interface - Nadar");
        List<Nadar> nadadores = new ArrayList<>(List.of(golfinho, pato, sapo));
        for (Nadar nadador : nadadores) {
            nadador.nadar("lago tranquilo");
            nadador.mergulhar(12);
            nadador.emergir();
        }

        separador("Polimorfismo por interface - Andar");
        List<Andar> andadores = new ArrayList<>(List.of(leao, pato, sapo));
        for (Andar andador : andadores) {
            andador.andar(30);
            andador.correr(60);
            andador.parar();
        }

        separador("Mapa de capacidades");
        for (Animal animal : animais) {
            boolean voa = animal instanceof Voar;
            boolean nada = animal instanceof Nadar;
            boolean anda = animal instanceof Andar;
            System.out.printf("%s -> voa: %s / nada: %s / anda: %s%n",
                    animal.getNome(),
                    voa ? "sim" : "não",
                    nada ? "sim" : "não",
                    anda ? "sim" : "não");
        }
    }
}
