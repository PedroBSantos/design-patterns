package com.design.patterns.states;

import java.math.BigDecimal;

import com.design.patterns.entities.Orcamento;

public class EmAnalise extends SituacaoOrcamento {
    
    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    public void aprovar(Orcamento orcamento) {
        orcamento.setSituacaoOrcamento(new Aprovado());
    }

    @Override
    public void reprovar(Orcamento orcamento) {
        orcamento.setSituacaoOrcamento(new Reprovado());
    }
}
