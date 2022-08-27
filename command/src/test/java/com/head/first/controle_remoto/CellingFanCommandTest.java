package com.head.first.controle_remoto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.head.first.controle_remoto.comandos.CellingFanHighCommand;
import com.head.first.controle_remoto.comandos.CellingFanOffCommand;
import com.head.first.controle_remoto.dispositivos.CellingFan;

public class CellingFanCommandTest {
    
    @Test
    @DisplayName("Deveria mudar a velocidade para high")
    public void test1() {
        var cellingFan = new CellingFan("Quarto");
        var cellingFanHighCommand = new CellingFanHighCommand(cellingFan);
        assertEquals(CellingFan.OFF, cellingFan.getSpeed());
        cellingFanHighCommand.execute();
        assertEquals(CellingFan.HIGH, cellingFan.getSpeed());
    }

    @Test
    @DisplayName("Deveria voltar para OFF quando executado undo")
    public void test2() {
        var cellingFan = new CellingFan("Quarto");
        var cellingFanHighCommand = new CellingFanHighCommand(cellingFan);
        assertEquals(CellingFan.OFF, cellingFan.getSpeed());
        cellingFanHighCommand.execute();
        assertEquals(CellingFan.HIGH, cellingFan.getSpeed());
        cellingFanHighCommand.undo();
        assertEquals(CellingFan.OFF, cellingFan.getSpeed());
    }

    @Test
    @DisplayName("Deveria mudar a velocidade para off")
    public void test3() {
        var cellingFan = new CellingFan("Quarto");
        var cellingFanHighCommand = new CellingFanHighCommand(cellingFan);
        assertEquals(CellingFan.OFF, cellingFan.getSpeed());
        cellingFanHighCommand.execute();
        assertEquals(CellingFan.HIGH, cellingFan.getSpeed());
        var cellingFanOffCommand = new CellingFanOffCommand(cellingFan);
        cellingFanOffCommand.execute();
        assertEquals(CellingFan.OFF, cellingFan.getSpeed());
        cellingFanOffCommand.undo();
        assertEquals(CellingFan.HIGH, cellingFan.getSpeed());
    }
}
