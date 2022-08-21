package com.head.first.tax;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Order implements Taxable {

    private final UUID id;
    private final LocalDateTime orderDate;
    private Set<OrderItem> orderItems;

    public Order(UUID id, LocalDateTime orderDate) {
        this.id = id;
        this.orderDate = orderDate;
        this.orderItems = new HashSet<>();
    }

    public UUID getId() {
        return id;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void addProduct(int amount, Product product) {
        if (amount <= 0) {
            return;
        }
        this.orderItems.add(new OrderItem(amount, product));
    }

    @Override
    public double calculatePrice() {
        return this.orderItems
            .stream()
            .reduce(0.0, (subTotal, orderItem) 
                -> subTotal + orderItem.calculateTotal(), Double::sum);
    }
}
