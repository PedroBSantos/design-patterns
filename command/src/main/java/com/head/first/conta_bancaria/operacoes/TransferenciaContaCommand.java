package com.head.first.conta_bancaria.operacoes;

import com.head.first.conta_bancaria.Conta;

public class TransferenciaContaCommand implements OperacaoContaCommand {

    private boolean operacaoConcluida;
    private final Conta contaOrigem;
    private final Conta contaDestino;
    private final double valor;

    public TransferenciaContaCommand(Conta contaOrigem, Conta contaDestino, double valor) {
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
        this.valor = valor;
        this.operacaoConcluida = false;
    }

    @Override
    public void executar() {
        this.contaOrigem.debitar(this.valor);
        this.contaDestino.creditar(this.valor);
        this.operacaoConcluida = true;
    }

    @Override
    public void desfazer() {
        if (this.operacaoConcluida) {
            this.contaOrigem.creditar(this.valor);
            this.contaDestino.debitar(this.valor);
        }
    }
}
