package com.head.first.conta_bancaria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.UUID;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.head.first.conta_bancaria.operacoes.CreditarContaCommand;

public class CreditarContaCommandTest {

    @Test
    @DisplayName("Deveria aumentar o saldo após crédito")
    public void test1() {
        var conta = new Conta(UUID.randomUUID(), "Pedro");
        assertEquals(0.0, conta.saldo());
        assertTrue(conta.getTransacoes().isEmpty());
        var operacao = new CreditarContaCommand(100.0, conta);
        operacao.executar();
        assertEquals(100.0, conta.saldo());
        assertFalse(conta.getTransacoes().isEmpty());
        assertEquals(1, conta.getTransacoes().size());
    }

    @Test
    @DisplayName("Deveria aumentar o saldo após crédito e depois diminuir após desfazer a operação")
    public void test2() {
        var conta = new Conta(UUID.randomUUID(), "Pedro");
        assertEquals(0.0, conta.saldo());
        assertTrue(conta.getTransacoes().isEmpty());
        var operacao = new CreditarContaCommand(100.0, conta);
        operacao.executar();
        assertEquals(100.0, conta.saldo());
        assertFalse(conta.getTransacoes().isEmpty());
        assertEquals(1, conta.getTransacoes().size());
        operacao.desfazer();
        assertFalse(conta.getTransacoes().isEmpty());
        assertEquals(2, conta.getTransacoes().size());
        assertEquals(0.0, conta.saldo());
    }
}
