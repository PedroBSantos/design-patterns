package com.head.first.pagamento.factories;

import java.util.UUID;

import com.head.first.pagamento.meios.CartaoCreditoMeioPagamento;
import com.head.first.pagamento.meios.MeioPagamento;

public class CartaoCreditoMeioPagamentoFactory extends MeioPagamentoFactory {

    @Override
    public MeioPagamento getInstance() {
        return new CartaoCreditoMeioPagamento(UUID.fromString("547ba81c-d3ab-40f0-900d-e18c635eb196"));
    }
}
