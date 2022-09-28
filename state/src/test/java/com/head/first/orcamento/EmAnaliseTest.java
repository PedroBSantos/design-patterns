package com.head.first.orcamento;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

public class EmAnaliseTest {
    
    @Test
    public void test1() {
        var emAnalise = new EmAnalise();
        var orcamento = new Orcamento(new BigDecimal("1000.0"), 2);
        assertInstanceOf(EmAnalise.class, orcamento.getSituacaoOrcamento());
        assertThrows(UnsupportedOperationException.class, () -> emAnalise.finalizar(orcamento));
    }

    @Test
    public void test2() {
        var emAnalise = new EmAnalise();
        var orcamento = new Orcamento(new BigDecimal("1000.0"), 2);
        assertInstanceOf(EmAnalise.class, orcamento.getSituacaoOrcamento());
        emAnalise.aprovar(orcamento);
        assertInstanceOf(Aprovado.class, orcamento.getSituacaoOrcamento());
    }

    @Test
    public void test3() {
        var emAnalise = new EmAnalise();
        var orcamento = new Orcamento(new BigDecimal("1000.0"), 2);
        assertInstanceOf(EmAnalise.class, orcamento.getSituacaoOrcamento());
        emAnalise.reprovar(orcamento);
        assertInstanceOf(Reprovado.class, orcamento.getSituacaoOrcamento());
    }

    @Test
    public void test4() {
        var emAnalise = new EmAnalise();
        var orcamento = new Orcamento(new BigDecimal("1000.0"), 2);
        var desconto = new BigDecimal("50.000");
        assertEquals(desconto, emAnalise.calcularValorDescontoExtra(orcamento));
    }
}
