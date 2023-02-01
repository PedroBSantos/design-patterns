package com.head.first.stock.domain;

import com.head.first.stock.stock_commands.StockCommand;
import com.head.first.stock.stock_commands.StockCommandType;

public class StockDecreaserService implements StockService {
    
    @Override
    public void execute(StockCommand command) {
        if (command.getType() != StockCommandType.SALE) {
            return;
        }
        command.execute();
    }
}
