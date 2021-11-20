package com.design.patterns.specs;

import java.math.BigDecimal;

import com.design.patterns.entities.Orcamento;

public class DescontoQtdMaiorCinco extends Desconto {

    public DescontoQtdMaiorCinco() {
        super();
    }

    public DescontoQtdMaiorCinco(Desconto proximoDesconto) {
        super(proximoDesconto);
    }

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        var desconto = orcamento.getQtdItens() > 5 ? orcamento.getValor().multiply(new BigDecimal("0.1"))
                : BigDecimal.ZERO;
        return proximoDesconto != null ? desconto.add(proximoDesconto.calcular(orcamento)) : desconto;
    }
}
