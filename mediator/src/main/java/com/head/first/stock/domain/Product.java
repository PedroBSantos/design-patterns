package com.head.first.stock.domain;

import java.math.BigDecimal;
import java.util.UUID;

public class Product {
    
    private UUID id;
    private String name;
    private BigDecimal price;
    private int stockAmount;

    public Product(UUID id, String name, BigDecimal price, int stockAmount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stockAmount = stockAmount;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void decreaseStockAmount(int amount) {
        if (this.stockAmount < amount) {
            return;
        }
        this.stockAmount -= amount;
    }

    public void increaseStockAmount(int amount) {
        if (amount < 0) {
            return;
        }
        this.stockAmount += amount;
    }
}
