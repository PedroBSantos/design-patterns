package com.head.first.stock.stock_commands;

import com.head.first.stock.domain.Product;

public class SaleProductCommand implements StockCommand {

    private Product product;
    private StockCommandType commandType;

    public SaleProductCommand(Product product) {
        this.product = product;
        this.commandType = StockCommandType.SALE;
    }

    @Override
    public StockCommandType getType() {
        return commandType;
    }

    @Override
    public void execute() {
        this.product.decreaseStockAmount(1);
    }
}
