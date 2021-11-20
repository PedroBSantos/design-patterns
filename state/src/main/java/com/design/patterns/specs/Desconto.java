package com.design.patterns.specs;

import java.math.BigDecimal;

import com.design.patterns.entities.Orcamento;

public abstract class Desconto {

    protected Desconto proximoDesconto;

    public Desconto() {
    }

    public Desconto(Desconto proximoDesconto) {
        this.proximoDesconto = proximoDesconto;
    }

    public abstract boolean aplicaDesconto(Orcamento orcamento);

    public abstract BigDecimal efetuarCalculo(Orcamento orcamento);

    public final BigDecimal calcular(Orcamento orcamento) {
        var desconto = new BigDecimal("0");
        if (this.aplicaDesconto(orcamento))
            desconto = this.efetuarCalculo(orcamento);
        return proximoDesconto != null ? desconto.add(this.proximoDesconto.calcular(orcamento)) : desconto;
    }
}
