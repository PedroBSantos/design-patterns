package com.head.first.conta_bancaria;

import java.util.LinkedList;
import java.util.Queue;

import com.head.first.conta_bancaria.operacoes.OperacaoContaCommand;

public class OperacaoContaBroker extends Subject<OperacaoContaCommand> {

    private Queue<OperacaoContaCommand> operacoes;
    private int actualObserver;

    public OperacaoContaBroker() {
        this.actualObserver = 0;
        this.operacoes = new LinkedList<OperacaoContaCommand>();
    }

    public void publish(OperacaoContaCommand operacao) {
        this.operacoes.add(operacao);
        this.notifyObservers();
    }

    @Override
    protected void notifyObservers() {
        this.observers.get(this.actualObserver).update(this.operacoes.poll());
        if (this.actualObserver == this.observers.size() - 1) {
            this.actualObserver = 0;
            return;
        }
        this.actualObserver++;
    }
}
