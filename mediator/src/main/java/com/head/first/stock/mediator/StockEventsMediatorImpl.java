package com.head.first.stock.mediator;

import java.util.HashSet;
import java.util.Set;

import com.head.first.stock.domain.StockService;
import com.head.first.stock.stock_commands.StockCommand;

public class StockEventsMediatorImpl implements StockEventsMediator {

    private Set<StockService> stockServices;

    public StockEventsMediatorImpl() {
        this.stockServices = new HashSet<>();
    }

    @Override
    public void send(StockCommand command) {
        this.stockServices.forEach(stockService -> stockService.execute(command));
    }

    @Override
    public void addReceiver(StockService stockService) {
        if (stockService == null) {
            return;
        }
        this.stockServices.add(stockService);
    }
}
