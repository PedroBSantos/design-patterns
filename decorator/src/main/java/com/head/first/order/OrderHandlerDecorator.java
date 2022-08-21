package com.head.first.order;

public abstract class OrderHandlerDecorator implements OrderHandler {
    
    protected OrderHandler orderHandler;

    @Override
    public abstract void handle(OrderDto orderDto);
}
