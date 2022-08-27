package com.head.first.conta_bancaria.operacoes;

public interface OperacaoContaCommand {
    
    void executar();

    void desfazer();
}
