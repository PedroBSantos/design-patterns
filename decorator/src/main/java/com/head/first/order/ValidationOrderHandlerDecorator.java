package com.head.first.order;

public class ValidationOrderHandlerDecorator extends OrderHandlerDecorator {

    public ValidationOrderHandlerDecorator(OrderHandler orderHandler) {
        this.orderHandler = orderHandler;
    }

    @Override
    public void handle(OrderDto orderDto) {
        this.doOrderDtoValidation(orderDto);
        this.orderHandler.handle(orderDto);
    }

    public void doOrderDtoValidation(OrderDto orderDto) {
        if (orderDto == null) {
            throw new RuntimeException("Order can not be null");
        }
        if (orderDto.getCustomerId() == null) {
            throw new RuntimeException("Customer id can not be null");
        }
        if (orderDto.getOrderItems() == null || orderDto.getOrderItems().isEmpty()) {
            throw new RuntimeException("Requested order does not have items");
        }
        if (orderDto.getOrderItems().stream().anyMatch(orderItem -> orderItem.getProductId() == null)) {
            throw new RuntimeException("Invalid product id");
        }
        if (orderDto.getOrderItems().stream().anyMatch(orderItem -> orderItem.getAmount() <= 0)) {
            throw new RuntimeException("Invalid product amount");
        }
    }
}
