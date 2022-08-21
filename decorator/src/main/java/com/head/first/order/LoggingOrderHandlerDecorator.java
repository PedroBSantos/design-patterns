package com.head.first.order;

import java.util.logging.Logger;

public class LoggingOrderHandlerDecorator extends OrderHandlerDecorator {

    private Logger logger;

    public LoggingOrderHandlerDecorator(OrderHandler orderHandler) {
        this.orderHandler = orderHandler;
        this.logger = Logger.getLogger(LoggingOrderHandlerDecorator.class.getSimpleName());
    }

    @Override
    public void handle(OrderDto orderDto) {
        this.doLoggingBeforeHandling(orderDto);
        this.orderHandler.handle(orderDto);
        this.doLoggingAfterHandling(orderDto);
    }

    public void doLoggingBeforeHandling(OrderDto orderDto) {
        this.logger.info("Before process order");
    }

    public void doLoggingAfterHandling(OrderDto orderDto) {
        this.logger.info("After process order");
    }
}
