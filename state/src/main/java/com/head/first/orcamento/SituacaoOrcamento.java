package com.head.first.orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {
    
    public void aprovar(Orcamento orcamento) {
        throw new UnsupportedOperationException();
    }

    public void reprovar(Orcamento orcamento) {
        throw new UnsupportedOperationException();
    }

    public void finalizar(Orcamento orcamento) {
        throw new UnsupportedOperationException();
    }

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }
}
