package com.head.first.stock_commands;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.util.UUID;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.head.first.stock.domain.Product;
import com.head.first.stock.stock_commands.PurchaseProductCommand;

public class PurchaseProductCommandTest {
    
    @Test
    @DisplayName("Ao executar o comando deveria aumentar a quantidade em estoque")
    public void test1() {
        var product = new Product(UUID.randomUUID(), "Intel Core i7", new BigDecimal("3000.0"), 20);
        var command = new PurchaseProductCommand(product);
        assertEquals(20, product.getStockAmount());
        command.execute();
        assertEquals(21, product.getStockAmount());
    }
}
