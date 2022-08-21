package com.head.first.pagamento.meios;

import java.util.UUID;

public class CartaoCreditoMeioPagamento extends MeioPagamento {

    public CartaoCreditoMeioPagamento(UUID id) {
        this.nome = "Cartão de Crédito";
        this.id = id;
    }
}
