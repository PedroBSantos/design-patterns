package com.design.patterns.entities;

import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import com.design.patterns.states.Aprovado;
import com.design.patterns.states.EmAnalise;
import com.design.patterns.states.Finalizado;
import com.design.patterns.states.Reprovado;

import org.junit.Test;

public class OrcamentoTest {

    @Test
    public void test1() {
        var orcamento = new Orcamento(new BigDecimal("800.0"), 3);
        assertTrue(orcamento.getSituacaoOrcamento().getClass().equals(EmAnalise.class));
        orcamento.aplicarDescontoExtra();
        assertTrue(orcamento.getValor().compareTo(new BigDecimal("760.0")) == 0);
        orcamento.aprovar();
        assertTrue(orcamento.getSituacaoOrcamento().getClass().equals(Aprovado.class));
        orcamento.finalizar();
        assertTrue(orcamento.getSituacaoOrcamento().getClass().equals(Finalizado.class));
    }

    @Test
    public void test2() {
        var orcamento = new Orcamento(new BigDecimal("800.0"), 3);
        assertTrue(orcamento.getSituacaoOrcamento().getClass().equals(EmAnalise.class));
        orcamento.reprovar();
        assertTrue(orcamento.getSituacaoOrcamento().getClass().equals(Reprovado.class));
        orcamento.finalizar();
        assertTrue(orcamento.getSituacaoOrcamento().getClass().equals(Finalizado.class));
    }

    @Test
    public void test3() {
        var orcamento = new Orcamento(new BigDecimal("800.0"), 3);
        assertTrue(orcamento.getSituacaoOrcamento().getClass().equals(EmAnalise.class));
        try {
            orcamento.finalizar();
        } catch (Exception exception) {
            assertTrue(orcamento.getSituacaoOrcamento().getClass().equals(EmAnalise.class));
        }
    }

    @Test
    public void test4() {
        var orcamento = new Orcamento(new BigDecimal("800.0"), 3);
        assertTrue(orcamento.getSituacaoOrcamento().getClass().equals(EmAnalise.class));
        orcamento.aprovar();
        assertTrue(orcamento.getSituacaoOrcamento().getClass().equals(Aprovado.class));
        try {
            orcamento.aprovar();
        } catch (Exception exception) {
            assertTrue(orcamento.getSituacaoOrcamento().getClass().equals(Aprovado.class));
        }
    }
}
