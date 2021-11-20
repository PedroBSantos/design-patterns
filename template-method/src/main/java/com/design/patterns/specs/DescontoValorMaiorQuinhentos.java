package com.design.patterns.specs;

import java.math.BigDecimal;

import com.design.patterns.entities.Orcamento;

public class DescontoValorMaiorQuinhentos extends Desconto {

    public DescontoValorMaiorQuinhentos() {
        super();
    }

    public DescontoValorMaiorQuinhentos(Desconto proximoDesconto) {
        super(proximoDesconto);
    }

    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean aplicaDesconto(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }
}
