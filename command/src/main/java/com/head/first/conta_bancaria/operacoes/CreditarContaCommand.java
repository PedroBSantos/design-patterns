package com.head.first.conta_bancaria.operacoes;

import com.head.first.conta_bancaria.Conta;

public class CreditarContaCommand implements OperacaoContaCommand {

    private boolean operacaoConcluida;
    private final Conta conta;
    private final double valor;

    public CreditarContaCommand(double valor, Conta conta) {
        this.valor = valor;
        this.conta = conta;
        this.operacaoConcluida = false;
    }

    @Override
    public void executar() {
        this.conta.creditar(this.valor);
        this.operacaoConcluida = true;
    }

    @Override
    public void desfazer() {
        if (this.operacaoConcluida) {
            this.conta.debitar(this.valor);
            this.operacaoConcluida = false;
        }
    }
}
