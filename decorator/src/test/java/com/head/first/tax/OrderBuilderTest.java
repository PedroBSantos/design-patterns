package com.head.first.tax;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.util.UUID;

import org.junit.jupiter.api.Test;

import com.head.first.tax.builder.OrderBuilder;
import com.head.first.tax.builder.OrderBuilderImpl;

public class OrderBuilderTest {

    @Test
    public void test1() {
        OrderBuilder orderBuilder = new OrderBuilderImpl();
        Taxable order = orderBuilder
                .withDate(LocalDateTime.now())
                .withId(UUID.randomUUID())
                .withProduct(1, new Product("i7 12700K", 3000.0))
                .skipToTaxs()
                .withICMSPercentage(0.05)
                .withISSPercentage(0.15)
                .build();
        assertEquals(3622.5, order.calculatePrice());
    }
}
