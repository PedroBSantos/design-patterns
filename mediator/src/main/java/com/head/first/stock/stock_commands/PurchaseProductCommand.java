package com.head.first.stock.stock_commands;

import com.head.first.stock.domain.Product;

public class PurchaseProductCommand implements StockCommand {

    private Product product;
    private StockCommandType commandType;

    public PurchaseProductCommand(Product product) {
        this.commandType = StockCommandType.PURCHASE;
        this.product = product;
    }

    @Override
    public StockCommandType getType() {
        return commandType;
    }

    @Override
    public void execute() {
        this.product.increaseStockAmount(1);
    }
}
