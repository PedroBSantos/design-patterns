package com.design.patterns.services;

import java.math.BigDecimal;

import com.design.patterns.entities.Orcamento;
import com.design.patterns.strategies.ImpostoStrategy;

public class CalcularImpostoService {

    public BigDecimal calcular(Orcamento orcamento, ImpostoStrategy impostoStrategy) {
        return impostoStrategy.calcular(orcamento);
    }
}
