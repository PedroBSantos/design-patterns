package com.head.first.bank.memento;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import com.head.first.bank.entities.Transaction;

public class AccountMemento {

    private UUID accountId;
    private String accountBank;
    private String accountOwnerName;
    private LocalDateTime createdAt;
    private Set<Transaction> accountTransactions;

    private AccountMemento() {
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getAccountBank() {
        return accountBank;
    }

    public UUID getAccountId() {
        return accountId;
    }

    public String getAccountOwnerName() {
        return accountOwnerName;
    }

    public List<Transaction> getAccountTransactions() {
        return accountTransactions.stream().toList();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((accountId == null) ? 0 : accountId.hashCode());
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
        AccountMemento other = (AccountMemento) obj;
        if (accountId == null) {
            if (other.accountId != null)
                return false;
        } else if (!accountId.equals(other.accountId))
            return false;
        return true;
    }

    public static class AccountMementoBuilder {

        private UUID accountId;
        private String bankName;
        private String accountOwnerName;
        private Set<Transaction> transactions;

        public AccountMementoBuilder() {
            this.transactions = new HashSet<>();
        }

        public AccountMementoBuilder withAccountId(UUID id) {
            this.accountId = id;
            return this;
        }

        public AccountMementoBuilder withBankName(String bank) {
            this.bankName = bank;
            return this;
        }

        public AccountMementoBuilder withAccountOwner(String owner) {
            this.accountOwnerName = owner;
            return this;
        }

        public AccountMementoBuilder withTransactions(Set<Transaction> transactions) {
            transactions.forEach(transaction -> this.transactions.add(transaction));
            return this;
        }

        public AccountMemento build() {
            var memento = new AccountMemento();
            memento.accountId = this.accountId;
            memento.accountBank = this.bankName;
            memento.accountOwnerName = this.accountOwnerName;
            memento.accountTransactions = this.transactions;
            memento.createdAt = LocalDateTime.now();
            return memento;
        }
    }
}
