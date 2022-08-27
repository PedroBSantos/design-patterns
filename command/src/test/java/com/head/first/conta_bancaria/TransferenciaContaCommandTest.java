package com.head.first.conta_bancaria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.UUID;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.head.first.conta_bancaria.operacoes.CreditarContaCommand;
import com.head.first.conta_bancaria.operacoes.TransferenciaContaCommand;

public class TransferenciaContaCommandTest {

    @Test
    @DisplayName("Deveria realizar a transferência de 100 entre as contas e depois desfazer a operação")
    public void test1() {
        var contaOrigem = new Conta(UUID.randomUUID(), "Pedro");
        var contaDestino = new Conta(UUID.randomUUID(), "Verônica");
        assertTrue(contaOrigem.getTransacoes().isEmpty());
        assertTrue(contaDestino.getTransacoes().isEmpty());
        var credito = new CreditarContaCommand(100, contaOrigem);
        credito.executar();
        assertEquals(100.0, contaOrigem.saldo());
        assertEquals(1, contaOrigem.getTransacoes().size());
        assertTrue(contaDestino.getTransacoes().isEmpty());
        assertEquals(0.0, contaDestino.saldo());
        var transferencia = new TransferenciaContaCommand(contaOrigem, contaDestino, 100);
        transferencia.executar();
        assertEquals(0.0, contaOrigem.saldo());
        assertEquals(2, contaOrigem.getTransacoes().size());
        assertFalse(contaDestino.getTransacoes().isEmpty());
        assertEquals(1, contaDestino.getTransacoes().size());
        assertEquals(100.0, contaDestino.saldo());
        transferencia.desfazer();
        assertEquals(100.0, contaOrigem.saldo());
        assertEquals(3, contaOrigem.getTransacoes().size());
        assertFalse(contaDestino.getTransacoes().isEmpty());
        assertEquals(2, contaDestino.getTransacoes().size());
        assertEquals(0.0, contaDestino.saldo());
    }
}
