package com.design.patterns.strategies;

import java.math.BigDecimal;

import com.design.patterns.entities.Orcamento;

public class ISSStrategy implements ImpostoStrategy {

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
}
