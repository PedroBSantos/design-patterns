package com.head.first.pagamento.factories;

import java.util.UUID;

import com.head.first.pagamento.meios.CartaoDebitoMeioPagamento;
import com.head.first.pagamento.meios.MeioPagamento;

public class CartaoDebitoMeioPagamentoFactory extends MeioPagamentoFactory {

    @Override
    public MeioPagamento getInstance() {
        return new CartaoDebitoMeioPagamento(UUID.fromString("4a00222b-d9bb-42f2-95a4-bb651894a29b"));
    }
}
