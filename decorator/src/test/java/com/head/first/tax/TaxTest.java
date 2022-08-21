package com.head.first.tax;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.util.UUID;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TaxTest {

    @Test
    @DisplayName("Deveria calcular o imposto ICMS")
    public void test1() {
        var order = new Order(UUID.randomUUID(), LocalDateTime.now());
        var product = new Product("i7 12700K", 3000.0);
        order.addProduct(1, product);
        var orderTotalPrice = order.calculatePrice();
        assertEquals(3000.0, orderTotalPrice);
        var icms = new ICMSDecorator(0.05, order);
        var icmsValue = icms.calculateICMSTax(orderTotalPrice);
        assertEquals(150, icmsValue);
    }

    @Test
    @DisplayName("Deveria calcular o imposto ISS")
    public void test2() {
        var order = new Order(UUID.randomUUID(), LocalDateTime.now());
        var product = new Product("i7 12700K", 3000.0);
        order.addProduct(1, product);
        var orderTotalPrice = order.calculatePrice();
        assertEquals(3000.0, orderTotalPrice);
        var iss = new ISSDecorator(0.15, order);
        var issValue = iss.calculateISSTax(orderTotalPrice);
        assertEquals(450, issValue);
    }

    @Test
    @DisplayName("Deveria calcular o preço do pedido")
    public void test3() {
        var order = new Order(UUID.randomUUID(), LocalDateTime.now());
        var product = new Product("i7 12700K", 3000.0);
        order.addProduct(1, product);
        assertEquals(3000.0, order.calculatePrice());
        var icms = new ICMSDecorator(0.05, order);
        var iss = new ISSDecorator(0.15, icms);
        assertEquals(3622.5, iss.calculatePrice());
    }
}
