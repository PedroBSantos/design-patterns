package com.head.first.orcamento;

public class Reprovado extends SituacaoOrcamento {
    
    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacaoOrcamento(new Finalizado());
    }
}
