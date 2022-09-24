package com.head.first.maquina_gomas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class GomasAcabaramTest {
    
    @Test
    public void test1() {
        var maquinaGomas = new MaquinaGoma(0);
        var exception = assertThrows(UnsupportedOperationException.class, () -> maquinaGomas.inserirMoeda());
        assertEquals("A máquina de gomas está sem gomas", exception.getMessage());
    }

    @Test
    public void test2() {
        var maquinaGomas = new MaquinaGoma(0);
        var exception = assertThrows(UnsupportedOperationException.class, () -> maquinaGomas.ejetarMoeda());
        assertEquals("A máquina de gomas está sem gomas", exception.getMessage());
    }

    @Test
    public void test3() {
        var maquinaGomas = new MaquinaGoma(0);
        var exception = assertThrows(UnsupportedOperationException.class, () -> maquinaGomas.acionarAlavanca());
        assertEquals("A máquina de gomas está sem gomas", exception.getMessage());
    }

    @Test
    public void test4() {
        var maquinaGomas = new MaquinaGoma(0);
        var exception = assertThrows(UnsupportedOperationException.class, () -> maquinaGomas.acionarAlavanca());
        assertEquals("A máquina de gomas está sem gomas", exception.getMessage());
    }
}
