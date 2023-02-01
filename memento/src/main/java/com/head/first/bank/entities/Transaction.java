package com.head.first.bank.entities;

import java.time.LocalDateTime;
import java.util.UUID;

public class Transaction {
    
    private UUID id;
    private double value;
    private LocalDateTime moment;
    private TransactionType type;

    public Transaction(UUID id, double value, LocalDateTime moment, TransactionType type) {
        this.id = id;
        this.value = value;
        this.moment = moment;
        this.type = type;
    }

    public UUID getId() {
        return id;
    }

    public double getValue() {
        return value;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public TransactionType getType() {
        return type;
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
        Transaction other = (Transaction) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}
