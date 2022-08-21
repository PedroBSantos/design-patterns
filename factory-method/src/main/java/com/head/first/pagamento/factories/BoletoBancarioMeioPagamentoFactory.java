package com.head.first.pagamento.factories;

import java.util.UUID;

import com.head.first.pagamento.meios.BoletoBancarioMeioPagamento;
import com.head.first.pagamento.meios.MeioPagamento;

public class BoletoBancarioMeioPagamentoFactory extends MeioPagamentoFactory {

    @Override
    public MeioPagamento getInstance() {
        return new BoletoBancarioMeioPagamento(UUID.fromString("eaa515a2-ac41-455f-ba3b-c9bc83566d45"));
    }
}
