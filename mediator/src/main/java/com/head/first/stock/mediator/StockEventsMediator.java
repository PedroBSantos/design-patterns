package com.head.first.stock.mediator;

import com.head.first.stock.domain.StockService;
import com.head.first.stock.stock_commands.StockCommand;

public interface StockEventsMediator {
    
    void send(StockCommand command);

    void addReceiver(StockService stockService);
}
