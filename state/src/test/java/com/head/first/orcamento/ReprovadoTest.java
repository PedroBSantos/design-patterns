package com.head.first.orcamento;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

public class ReprovadoTest {
    
    @Test
    public void test1() {
        var reprovado = new Reprovado();
        var orcamento = new Orcamento(new BigDecimal("1000.0"), 2);
        assertThrows(UnsupportedOperationException.class, () -> reprovado.aprovar(orcamento));
    }

    @Test
    public void test2() {
        var reprovado = new Reprovado();
        var orcamento = new Orcamento(new BigDecimal("1000.0"), 2);
        assertThrows(UnsupportedOperationException.class, () -> reprovado.reprovar(orcamento));
    }

    @Test
    public void test3() {
        var reprovado = new Reprovado();
        var orcamento = new Orcamento(new BigDecimal("1000.0"), 2);
        assertInstanceOf(EmAnalise.class, orcamento.getSituacaoOrcamento());
        reprovado.finalizar(orcamento);
        assertInstanceOf(Finalizado.class, orcamento.getSituacaoOrcamento());
    }
}
