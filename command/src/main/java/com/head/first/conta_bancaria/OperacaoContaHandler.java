package com.head.first.conta_bancaria;

import com.head.first.conta_bancaria.operacoes.OperacaoContaCommand;

@SuppressWarnings("unused")
public class OperacaoContaHandler implements Observer<OperacaoContaCommand> {

    private final String nome;

    public OperacaoContaHandler(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(OperacaoContaCommand operacao) {
        operacao.executar();    
    }
}
