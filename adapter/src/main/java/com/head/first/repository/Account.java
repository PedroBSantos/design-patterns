package com.head.first.repository;

import java.util.UUID;

public class Account {
    
    private UUID id;
    private String ownerName;
    private double balance;

    public Account(UUID id, String ownerName, double balance) {
        this.id = id;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public UUID getId() {
        return id;
    }

    public String getOwnerName() {
        return ownerName;
    }
    
    public double getBalance() {
        return balance;
    }

    public void credit(double amount) {
        if (amount <= 0) {
            throw new RuntimeException("Invalid credit amount: R$" + amount);
        }
        this.balance += amount;
    }
}
