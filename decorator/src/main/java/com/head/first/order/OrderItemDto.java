package com.head.first.order;

import java.util.UUID;

public class OrderItemDto {

    private final UUID productId;
    private final int amount;

    public OrderItemDto(UUID productId, int amount) {
        this.productId = productId;
        this.amount = amount;
    }

    public UUID getProductId() {
        return productId;
    }

    public int getAmount() {
        return amount;
    }
}
