package com.head.first.order;

import java.util.List;
import java.util.UUID;

public class OrderDto {

    private final UUID customerId;
    private final List<OrderItemDto> orderItems;

    public OrderDto(UUID customerId, List<OrderItemDto> orderItems) {
        this.customerId = customerId;
        this.orderItems = orderItems;
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public List<OrderItemDto> getOrderItems() {
        return orderItems.stream().toList();
    }
}
