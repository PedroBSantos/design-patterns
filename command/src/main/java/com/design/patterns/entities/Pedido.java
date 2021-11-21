package com.design.patterns.entities;

import java.time.LocalDateTime;

public class Pedido {

    private String cliente;
    private LocalDateTime dataPedido;
    private Orcamento orcamento;

    public Pedido(String cliente, LocalDateTime dataPedido, Orcamento orcamento) {
        this.cliente = cliente;
        this.dataPedido = dataPedido;
        this.orcamento = orcamento;
    }

    public String getCliente() {
        return cliente;
    }

    public LocalDateTime getDataPedido() {
        return dataPedido;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }
}
