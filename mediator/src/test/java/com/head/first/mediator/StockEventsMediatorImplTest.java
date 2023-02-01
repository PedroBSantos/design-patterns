package com.head.first.mediator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.util.UUID;

import org.junit.jupiter.api.Test;

import com.head.first.stock.domain.Product;
import com.head.first.stock.domain.StockDecreaserService;
import com.head.first.stock.domain.StockIncreaserService;
import com.head.first.stock.mediator.StockEventsMediatorImpl;
import com.head.first.stock.stock_commands.SaleProductCommand;

public class StockEventsMediatorImplTest {
    
    @Test
    public void test1() {
        var decreaserService = new StockDecreaserService();
        var increaserService = new StockIncreaserService();
        var mediator = new StockEventsMediatorImpl();
        mediator.addReceiver(decreaserService);
        mediator.addReceiver(increaserService);
        var product = new Product(UUID.randomUUID(), "Intel Core i7", new BigDecimal("3000.0"), 20);
        var command = new SaleProductCommand(product);
        assertEquals(20, product.getStockAmount());
        mediator.send(command);
        assertEquals(19, product.getStockAmount());
    }
}
