package com.head.first.bank.entities;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import com.head.first.bank.memento.AccountMemento;

public class Account {
    
    private UUID id;
    private String bank;
    private String ownerName;
    private Set<Transaction> transactions;

    public Account(UUID id, String bank, String ownerName) {
        this.transactions = new HashSet<>();
        this.id = id;
        this.bank = bank;
        this.ownerName = ownerName;
    }

    public UUID getId() {
        return id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getBank() {
        return bank;
    }

    public void credit(double value) {
        if (value <= 0) {
            throw new RuntimeException("Credit value must be greather than 0");
        }
        var transaction = new Transaction(UUID.randomUUID(), value, LocalDateTime.now(), TransactionType.CREDIT);
        this.transactions.add(transaction);
    }

    public void debit(double value) {
        var currentBalance = this.balance();
        if (currentBalance < value) {
            throw new RuntimeException("Current account balance is lowest than debit value: " + value);
        }
        var transaction = new Transaction(UUID.randomUUID(), value, LocalDateTime.now(), TransactionType.DEBIT);
        this.transactions.add(transaction);
    }

    public double balance() {
        var total = 0.0;
        for (var transaction : transactions) {
            if (transaction.getType() == TransactionType.CREDIT) {
                total += transaction.getValue();
            }
            if (transaction.getType() == TransactionType.DEBIT) {
                total = total - transaction.getValue();
            }
        }
        return total;
    }

    public boolean hasNoTransactions() {
        return this.transactions.isEmpty();
    }

    public int numberOfTransactions() {
        return this.transactions.size();
    }

    public AccountMemento createMemento() {
        var memento = new AccountMemento.AccountMementoBuilder()
            .withAccountId(this.id)
            .withAccountOwner(this.ownerName)
            .withBankName(this.bank)
            .withTransactions(this.transactions)
            .build();
        return memento;
    }

    public void restoreFromMemento(AccountMemento memento) {
        this.id = memento.getAccountId();
        this.bank = memento.getAccountBank();
        this.ownerName = memento.getAccountOwnerName();
        this.transactions.clear();
        memento.getAccountTransactions().forEach(transaction -> this.transactions.add(transaction));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Account other = (Account) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}
