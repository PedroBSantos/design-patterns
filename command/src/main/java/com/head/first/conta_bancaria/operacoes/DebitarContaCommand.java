package com.head.first.conta_bancaria.operacoes;

import com.head.first.conta_bancaria.Conta;

public class DebitarContaCommand implements OperacaoContaCommand {

    private boolean operacaoConcluida;
    private final Conta conta;
    private final double valor;

    public DebitarContaCommand(Conta conta, double valor) {
        this.conta = conta;
        this.valor = valor;
        this.operacaoConcluida = false;
    }

    @Override
    public void executar() {
        this.conta.debitar(this.valor);
        this.operacaoConcluida = true;
    }

    @Override
    public void desfazer() {
        if (this.operacaoConcluida) {
            this.conta.creditar(this.valor);
        }
    }
}
