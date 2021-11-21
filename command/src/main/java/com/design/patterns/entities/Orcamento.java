package com.design.patterns.entities;

import java.math.BigDecimal;

import com.design.patterns.states.EmAnalise;
import com.design.patterns.states.SituacaoOrcamento;

public class Orcamento {

    private BigDecimal valor;
    private int qtdItens;
    private SituacaoOrcamento situacaoOrcamento;

    public Orcamento(BigDecimal valor, int qtdItens) {
        this.valor = valor;
        this.qtdItens = qtdItens;
        this.situacaoOrcamento = new EmAnalise();
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQtdItens() {
        return qtdItens;
    }

    public SituacaoOrcamento getSituacaoOrcamento() {
        return situacaoOrcamento;
    }

    public void setSituacaoOrcamento(SituacaoOrcamento situacaoOrcamento) {
        this.situacaoOrcamento = situacaoOrcamento;
    }

    public void aplicarDescontoExtra() {
        var desconto = this.situacaoOrcamento.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(desconto);
    }

    public void aprovar() {
        this.situacaoOrcamento.aprovar(this);
    }

    public void reprovar() {
        this.situacaoOrcamento.reprovar(this);
    }

    public void finalizar() {
        this.situacaoOrcamento.finalizar(this);
    }
}
