package com.head.first.orcamento;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

public class FinalizadoTest {
    
    @Test
    public void test1() {
        var finalizado = new Finalizado();
        var orcamento = new Orcamento(new BigDecimal("1000.0"), 2);
        assertThrows(UnsupportedOperationException.class, () -> finalizado.aprovar(orcamento));
    }

    @Test
    public void test2() {
        var finalizado = new Finalizado();
        var orcamento = new Orcamento(new BigDecimal("1000.0"), 2);
        assertThrows(UnsupportedOperationException.class, () -> finalizado.reprovar(orcamento));
    }

    @Test
    public void test3() {
        var finalizado = new Finalizado();
        var orcamento = new Orcamento(new BigDecimal("1000.0"), 2);
        assertThrows(UnsupportedOperationException.class, () -> finalizado.finalizar(orcamento));
    }
}
