package com.head.first;

import java.util.List;
import java.util.UUID;

import com.head.first.order.LoggingOrderHandlerDecorator;
import com.head.first.order.OrderDto;
import com.head.first.order.OrderHandler;
import com.head.first.order.OrderHandlerImpl;
import com.head.first.order.OrderItemDto;
import com.head.first.order.ValidationOrderHandlerDecorator;

public class App {

    public static void main(String[] args) {
        OrderHandler orderHandler = new LoggingOrderHandlerDecorator(
                new ValidationOrderHandlerDecorator(
                        new OrderHandlerImpl()));
        var orderDto = new OrderDto(UUID.randomUUID(), 
            List.of(new OrderItemDto(UUID.randomUUID(), 1)));
        orderHandler.handle(orderDto);
    }
}
