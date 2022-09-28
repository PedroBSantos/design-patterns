package com.head.first.orcamento;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

public class OrcamentoTest {
    
    @Test
    public void test1() {
        var orcamento = new Orcamento(new BigDecimal("1000.0"), 2);
        assertInstanceOf(EmAnalise.class, orcamento.getSituacaoOrcamento());
        orcamento.aplicarDescontoExtra();
        assertEquals(new BigDecimal("950.000"), orcamento.getValor());
    }
}
