package com.design.patterns.commands;

import java.math.BigDecimal;

public class GerarPedidoCommand {

    private String cliente;
    private BigDecimal valorOrcamento;
    private Integer qtdItens;

    public GerarPedidoCommand(String cliente, BigDecimal valorOrcamento, Integer qtdItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.qtdItens = qtdItens;
    }

    public String getCliente() {
        return cliente;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public Integer getQtdItens() {
        return qtdItens;
    }
}
