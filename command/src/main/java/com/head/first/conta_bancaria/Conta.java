package com.head.first.conta_bancaria;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Conta {

    private UUID id;
    private String dono;
    private List<Transacao> transacoes;

    public Conta(UUID id, String dono) {
        this.id = id;
        this.dono = dono;
        this.transacoes = new ArrayList<Transacao>();
    }

    public UUID getId() {
        return id;
    }

    public String getDono() {
        return dono;
    }

    public List<Transacao> getTransacoes() {
        return transacoes.stream().toList();
    }

    public void creditar(double valor) {
        if (valor <= 0) {
            throw new RuntimeException("Valor de crédito inválido");
        }
        var transacao = new Transacao(UUID.randomUUID(), LocalDateTime.now(), TipoTransacao.CREDITO, valor, this);
        this.transacoes.add(transacao);
    }

    public void debitar(double valor) {
        if (this.saldo() < valor) {
            throw new RuntimeException("Saldo atual insuficiente.");
        }
        var transacao = new Transacao(UUID.randomUUID(), LocalDateTime.now(), TipoTransacao.DEBITO, valor, this);
        this.transacoes.add(transacao);
    }

    public double saldo() {
        var saldo = 0.0;
        for (var transacao : this.transacoes) {
            if (transacao.getTipoTransacao() == TipoTransacao.CREDITO) {
                saldo += transacao.getValor();
                continue;
            }
            saldo -= transacao.getValor();
        }
        return saldo;
    }
}
