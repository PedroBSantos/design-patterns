package com.head.first.pagamento.meios;

import java.util.UUID;

public class CartaoDebitoMeioPagamento extends MeioPagamento {
    
    public CartaoDebitoMeioPagamento(UUID id) {
        this.nome = "Cartão de Débito";
        this.id = id;
    }
}
