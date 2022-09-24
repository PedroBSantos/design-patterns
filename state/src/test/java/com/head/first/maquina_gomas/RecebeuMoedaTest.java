package com.head.first.maquina_gomas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RecebeuMoedaTest {

    @Test
    @DisplayName("Deveria voltar o estado para SemMoeda ao ejetar uma moeda")
    public void test1() {
        var maquinaGomas = new MaquinaGoma(10);
        maquinaGomas.inserirMoeda();
        assertInstanceOf(RecebeuMoeda.class, maquinaGomas.getEstadoAtual());
        maquinaGomas.ejetarMoeda();
        assertInstanceOf(SemMoeda.class, maquinaGomas.getEstadoAtual());
    }

    @Test
    @DisplayName("Deveria lançar uma exceção ao tentar inserir duas moedas")
    public void test2() {
        var maquinaGomas = new MaquinaGoma(10);
        maquinaGomas.inserirMoeda();
        assertInstanceOf(RecebeuMoeda.class, maquinaGomas.getEstadoAtual());
        var exception = assertThrows(UnsupportedOperationException.class, () -> maquinaGomas.inserirMoeda());
        assertEquals("A moeda já foi inserida", exception.getMessage());
    }
}
