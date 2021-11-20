package com.design.patterns.states;

import com.design.patterns.entities.Orcamento;

public class Aprovado extends SituacaoOrcamento {

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacaoOrcamento(new Finalizado());
    }
}
