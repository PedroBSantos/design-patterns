package com.head.first.pagamento.meios;

import java.util.UUID;

public class BoletoBancarioMeioPagamento extends MeioPagamento {
    
    public BoletoBancarioMeioPagamento(UUID id) {
        this.nome = "Boleto Bancário";
        this.id = id;
    }
}
