package com.head.first.orcamento;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

public class AprovadoTest {
    
    @Test
    public void test1() {
        var aprovado = new Aprovado();
        var orcamento = new Orcamento(new BigDecimal("1000.0"), 2);
        assertThrows(UnsupportedOperationException.class, () -> aprovado.aprovar(orcamento));
    }

    @Test
    public void test2() {
        var aprovado = new Aprovado();
        var orcamento = new Orcamento(new BigDecimal("1000.0"), 2);
        assertThrows(UnsupportedOperationException.class, () -> aprovado.reprovar(orcamento));
    }

    @Test
    public void test3() {
        var aprovado = new Aprovado();
        var orcamento = new Orcamento(new BigDecimal("1000.0"), 2);
        assertInstanceOf(EmAnalise.class, orcamento.getSituacaoOrcamento());
        aprovado.finalizar(orcamento);
        assertInstanceOf(Finalizado.class, orcamento.getSituacaoOrcamento());
    }
}
