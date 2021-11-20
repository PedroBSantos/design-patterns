package com.design.patterns.services;

import java.math.BigDecimal;

import com.design.patterns.entities.Orcamento;
import com.design.patterns.specs.DescontoQtdMaiorCinco;
import com.design.patterns.specs.DescontoValorMaiorQuinhentos;

public class CalcularDescontoService {

    public BigDecimal calcular(Orcamento orcamento) {
        var cadeiaDescontos = new DescontoQtdMaiorCinco(new DescontoValorMaiorQuinhentos());
        return cadeiaDescontos.calcular(orcamento);
    }
}
