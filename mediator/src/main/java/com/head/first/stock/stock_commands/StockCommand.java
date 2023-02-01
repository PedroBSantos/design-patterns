package com.head.first.stock.stock_commands;

public interface StockCommand {

    StockCommandType getType();

    void execute();
}
