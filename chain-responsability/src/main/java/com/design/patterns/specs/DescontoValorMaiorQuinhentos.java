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
    public BigDecimal calcular(Orcamento orcamento) {
        var desconto = orcamento.getValor().compareTo(new BigDecimal("500")) > 0 ? orcamento.getValor().multiply(new BigDecimal("0.1"))
                : BigDecimal.ZERO;
        return proximoDesconto != null ? desconto.add(proximoDesconto.calcular(orcamento)) : desconto;
    }
}
