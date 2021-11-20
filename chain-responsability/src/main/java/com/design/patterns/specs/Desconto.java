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

    public abstract BigDecimal calcular(Orcamento orcamento);
}
