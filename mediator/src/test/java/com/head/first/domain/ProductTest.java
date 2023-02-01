package com.head.first.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.util.UUID;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.head.first.stock.domain.Product;

public class ProductTest {
    
    @Test
    @DisplayName("Deveria reduzir a quantidade em estoque")
    public void test1() {
        var product = new Product(UUID.randomUUID(), "Intel Core i7", new BigDecimal("3000.0"), 20);
        assertEquals(20, product.getStockAmount());
        product.decreaseStockAmount(1);
        assertEquals(19, product.getStockAmount());
    }

    @Test
    @DisplayName("Não deveria reduzir a quantidade em estoque quando esta em 0")
    public void test2() {
        var product = new Product(UUID.randomUUID(), "Intel Core i7", new BigDecimal("3000.0"), 0);
        assertEquals(0, product.getStockAmount());
        product.decreaseStockAmount(1);
        assertEquals(0, product.getStockAmount());
    }

    @Test
    @DisplayName("Deveria aumentar a quantidade em estoque")
    public void test3() {
        var product = new Product(UUID.randomUUID(), "Intel Core i7", new BigDecimal("3000.0"), 0);
        assertEquals(0, product.getStockAmount());
        product.increaseStockAmount(1);
        assertEquals(1, product.getStockAmount());
    }

    @Test
    @DisplayName("Não deveria aumentar a quantidade em estoque quando o valor passado for negativo")
    public void test4() {
        var product = new Product(UUID.randomUUID(), "Intel Core i7", new BigDecimal("3000.0"), 0);
        assertEquals(0, product.getStockAmount());
        product.increaseStockAmount(-1);
        assertEquals(0, product.getStockAmount());
    }

    @Test
    @DisplayName("Não deveria reduzir a quantidade em estoque quando o valor passado for maior que a quantidade atual em estoque")
    public void test5() {
        var product = new Product(UUID.randomUUID(), "Intel Core i7", new BigDecimal("3000.0"), 20);
        assertEquals(20, product.getStockAmount());
        product.decreaseStockAmount(21);
        assertEquals(20, product.getStockAmount());
    }
}
