package com.head.first.pagamento.meios;

import java.util.UUID;

public abstract class MeioPagamento {

    protected UUID id;
    protected String nome;

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
