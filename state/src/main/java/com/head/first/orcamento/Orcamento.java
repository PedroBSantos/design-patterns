package com.head.first.orcamento;

import java.math.BigDecimal;

public class Orcamento {
    
    private BigDecimal valor;
    private int qtdItens;
    private SituacaoOrcamento situacaoOrcamento;

    public Orcamento(BigDecimal valor, int qtdItens) {
        this.valor = valor;
        this.qtdItens = qtdItens;
        this.situacaoOrcamento = new EmAnalise();
    }

    public int getQtdItens() {
        return qtdItens;
    }

    public SituacaoOrcamento getSituacaoOrcamento() {
        return situacaoOrcamento;
    }

    void setSituacaoOrcamento(SituacaoOrcamento situacaoOrcamento) {
        this.situacaoOrcamento = situacaoOrcamento;
    }

    public BigDecimal getValor() {
        return valor;
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

    public void aplicarDescontoExtra() {
        var desconto = this.situacaoOrcamento.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(desconto);
    }
}
