package com.head.first.maquina_gomas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SemMoedaTest {

    @Test
    @DisplayName("Inserir moeda deveria alterar o estado para RecebeuMoeda")
    public void test1() {
        var maquinaGomas = new MaquinaGoma(10);
        maquinaGomas.inserirMoeda();
        assertInstanceOf(RecebeuMoeda.class, maquinaGomas.getEstadoAtual());
    }

    @Test
    @DisplayName("Deveria lançar uma exceção ao tentar ejetar uma moeda sem antes inseri-la")
    public void test2() {
        var maquinaGomas = new MaquinaGoma(10);
        var exception = assertThrows(UnsupportedOperationException.class, () -> maquinaGomas.ejetarMoeda());
        assertEquals("É necessário inserir uma moeda para ejeta-la", exception.getMessage());
    }

    @Test
    @DisplayName("Deveria lançar uma exceção ao tentar acionar a alavanca antes de inserir uma moeda")
    public void test3() {
        var maquinaGomas = new MaquinaGoma(10);
        assertEquals(0, maquinaGomas.getVezesAlavancaAcionada());
        var exception = assertThrows(UnsupportedOperationException.class, () -> maquinaGomas.acionarAlavanca());
        assertEquals(0, maquinaGomas.getVezesAlavancaAcionada());
        assertEquals("Antes de acionar a alavanca é preciso inserir uma moeda", exception.getMessage());
    }
}
