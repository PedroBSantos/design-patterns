package com.head.first.memento;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.UUID;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.head.first.bank.entities.Account;

public class AccountMementoTest {

    @Test
    @DisplayName("Deveria restaurar o estado da conta após realizar um credito")
    public void test1() {
        var account = new Account(UUID.randomUUID(), "Caixa", "Pedro");
        assertTrue(account.hasNoTransactions());
        assertEquals(0.0, account.balance());
        var accountStateBeforeCredit = account.createMemento();
        account.credit(100.0);
        assertFalse(account.hasNoTransactions());
        assertEquals(100.0, account.balance());
        account.restoreFromMemento(accountStateBeforeCredit);
        assertTrue(account.hasNoTransactions());
        assertEquals(0.0, account.balance());
    }

    @Test
    @DisplayName("Deveria restaurar o estado da conta após realizar um debito")
    public void test2() {
        var account = new Account(UUID.randomUUID(), "Caixa", "Pedro");
        assertTrue(account.hasNoTransactions());
        assertEquals(0.0, account.balance());
        account.credit(100.0);
        var accountStateBeforeDebit = account.createMemento();
        account.debit(50.0);
        assertFalse(account.hasNoTransactions());
        assertEquals(50.0, account.balance());
        account.restoreFromMemento(accountStateBeforeDebit);
        assertFalse(account.hasNoTransactions());
        assertEquals(100.0, account.balance());
        assertEquals(1, account.numberOfTransactions());
    }
}
