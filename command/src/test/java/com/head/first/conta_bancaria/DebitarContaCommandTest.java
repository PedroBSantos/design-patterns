package com.head.first.conta_bancaria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.UUID;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.head.first.conta_bancaria.operacoes.CreditarContaCommand;
import com.head.first.conta_bancaria.operacoes.DebitarContaCommand;

public class DebitarContaCommandTest {

    @Test
    @DisplayName("Deveria realizar o débito de 100 e realizar o crédito após desfazer a operação")
    public void test1() {
        var conta = new Conta(UUID.randomUUID(), "Pedro");
        assertEquals(0, conta.saldo());
        assertTrue(conta.getTransacoes().isEmpty());
        var credito = new CreditarContaCommand(100.0, conta);
        var debito = new DebitarContaCommand(conta, 100.0);
        credito.executar();
        assertEquals(100.0, conta.saldo());
        assertFalse(conta.getTransacoes().isEmpty());
        assertEquals(1, conta.getTransacoes().size());
        debito.executar();
        assertEquals(0.0, conta.saldo());
        assertFalse(conta.getTransacoes().isEmpty());
        assertEquals(2, conta.getTransacoes().size());
        debito.desfazer();
        assertEquals(100.0, conta.saldo());
        assertFalse(conta.getTransacoes().isEmpty());
        assertEquals(3, conta.getTransacoes().size());
    }
}
