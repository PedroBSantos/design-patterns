package com.head.first.conta_bancaria;

import java.time.LocalDateTime;
import java.util.UUID;

public class Transacao {
    
    private UUID id;
    private LocalDateTime horario;
    private TipoTransacao tipoTransacao;
    private double valor;
    private Conta conta;

    public Transacao(UUID id, LocalDateTime horario, TipoTransacao tipoTransacao, double valor, Conta conta) {
        this.id = id;
        this.horario = horario;
        this.tipoTransacao = tipoTransacao;
        this.valor = valor;
        this.conta = conta;
    }

    public UUID getId() {
        return id;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public TipoTransacao getTipoTransacao() {
        return tipoTransacao;
    }

    public Conta getConta() {
        return conta;
    }

    public double getValor() {
        return valor;
    }
}
