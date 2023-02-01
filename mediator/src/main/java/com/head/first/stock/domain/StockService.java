package com.head.first.stock.domain;

import com.head.first.stock.stock_commands.StockCommand;

public interface StockService {
    
    void execute(StockCommand command);
}
