package com.head.first.conta_bancaria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.UUID;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.head.first.conta_bancaria.operacoes.CreditarContaCommand;
import com.head.first.conta_bancaria.operacoes.DebitarContaCommand;

public class OperacaoContaBrokerTest {

    @Test
    @DisplayName("O broker deveria enviar o comando de credito para o handler")
    public void test1() {
        var conta = new Conta(UUID.randomUUID(), "Pedro");
        var credito = new CreditarContaCommand(100.0, conta);
        var operacaoContaBroker = new OperacaoContaBroker();
        var operacaoContaHandler1 = new OperacaoContaHandler("handler-1");
        var operacaoContaHandler2 = new OperacaoContaHandler("handler-2");
        operacaoContaBroker.attach(operacaoContaHandler1);
        operacaoContaBroker.attach(operacaoContaHandler2);
        assertEquals(0.0, conta.saldo());
        assertTrue(conta.getTransacoes().isEmpty());
        operacaoContaBroker.publish(credito);
        assertEquals(100.0, conta.saldo());
        assertFalse(conta.getTransacoes().isEmpty());
        assertEquals(1, conta.getTransacoes().size());
        var debito = new DebitarContaCommand(conta, 50.0);
        operacaoContaBroker.publish(debito);
        assertEquals(50.0, conta.saldo());
        assertFalse(conta.getTransacoes().isEmpty());
        assertEquals(2, conta.getTransacoes().size());
    }
}
