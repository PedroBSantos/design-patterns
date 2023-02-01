package com.head.first.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.UUID;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.head.first.bank.entities.Account;

public class AccountTest {
    
    @Test
    @DisplayName("Deveria instanciar uma conta com saldo zerado e sem transações")
    public void test1() {
        var account = new Account(UUID.randomUUID(), "Caixa", "Pedro");
        assertTrue(account.hasNoTransactions());
        assertEquals(0.0, account.balance());
    }

    @Test
    @DisplayName("Deveria aumentar o saldo em 100.0 e possuir apenas uma transação")
    public void test2() {
        var account = new Account(UUID.randomUUID(), "Caixa", "Pedro");
        account.credit(100.0);
        assertEquals(100.0, account.balance());
        assertEquals(1, account.numberOfTransactions());
    }

    @Test
    @DisplayName("Deveria debitar 50.0 de 100.0 e possuir duas transações")
    public void test3() {
        var account = new Account(UUID.randomUUID(), "Caixa", "Pedro");
        account.credit(100.0);
        assertEquals(100.0, account.balance());
        assertEquals(1, account.numberOfTransactions());
        account.debit(50.0);
        assertEquals(50.0, account.balance());
        assertEquals(2, account.numberOfTransactions());
    }
}
