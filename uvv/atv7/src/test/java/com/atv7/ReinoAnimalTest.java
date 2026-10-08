package com.atv7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

class ReinoAnimalTest {

    @Test
    void deveValidarCapacidadesPorInterface() {
        Animal aguia = new Aguia("Águia", 5.2, 2.4);
        Animal golfinho = new Golfinho("Golfinho", 120.0, "Tursiops truncatus");
        Animal leao = new Leao("Leão", 180.0, "Rei da Savana");
        Animal pato = new Pato("Pato", 2.0);
        Animal sapo = new Sapo("Sapo", 0.8, "Neurotóxico");

        assertTrue(aguia instanceof Voar);
        assertFalse(aguia instanceof Nadar);
        assertFalse(aguia instanceof Andar);

        assertFalse(golfinho instanceof Voar);
        assertTrue(golfinho instanceof Nadar);
        assertFalse(golfinho instanceof Andar);

        assertFalse(leao instanceof Voar);
        assertFalse(leao instanceof Nadar);
        assertTrue(leao instanceof Andar);

        assertTrue(pato instanceof Voar);
        assertTrue(pato instanceof Nadar);
        assertTrue(pato instanceof Andar);

        assertFalse(sapo instanceof Voar);
        assertTrue(sapo instanceof Nadar);
        assertTrue(sapo instanceof Andar);
    }

    @Test
    void devePolimorficoExecutarEmitirSomEAlimentar() {
        List<Animal> animais = List.of(
                new Aguia("Águia", 5.2, 2.4),
                new Golfinho("Golfinho", 120.0, "Tursiops truncatus"),
                new Leao("Leão", 180.0, "Rei da Savana"),
                new Pato("Pato", 2.0),
                new Sapo("Sapo", 0.8, "Neurotóxico")
        );

        assertEquals(5, animais.size());
        for (Animal animal : animais) {
            animal.emitirSom();
            animal.alimentar();
        }
    }
}
