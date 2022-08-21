package com.head.first.pagamento.factories;

import com.head.first.pagamento.meios.MeioPagamento;
import com.head.first.pagamento.meios.TipoMeioPagamento;

public abstract class MeioPagamentoFactory {

    public abstract MeioPagamento getInstance();

    public static final MeioPagamentoFactory getInstance(TipoMeioPagamento tipoMeioPagamento) {
        if (tipoMeioPagamento == TipoMeioPagamento.CREDITO) {
            return new CartaoCreditoMeioPagamentoFactory();
        }
        if (tipoMeioPagamento == TipoMeioPagamento.DEBITO) {
            return new CartaoDebitoMeioPagamentoFactory();
        }
        if (tipoMeioPagamento == TipoMeioPagamento.BOLETO) {
            return new BoletoBancarioMeioPagamentoFactory();
        }
        throw new RuntimeException(
                "Não foi possível instanciar a factory para o meio de pagamento " + tipoMeioPagamento);
    }
}
