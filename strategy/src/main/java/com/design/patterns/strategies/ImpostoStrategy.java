package com.design.patterns.strategies;

import java.math.BigDecimal;

import com.design.patterns.entities.Orcamento;

public interface ImpostoStrategy {
    
    BigDecimal calcular(Orcamento orcamento);
}
