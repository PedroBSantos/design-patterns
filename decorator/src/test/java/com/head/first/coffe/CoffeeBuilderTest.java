package com.head.first.coffe;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.head.first.coffee.Beverage;
import com.head.first.coffee.BeverageSize;
import com.head.first.coffee.builder.CoffeeBuilder;

public class CoffeeBuilderTest {
    
    @Test
    @DisplayName("Deve construir o café")
    public void test1() {
        Beverage beverage = new CoffeeBuilder()
            .oneDarkRoast(BeverageSize.TALL)
            .withCaramel()
            .withSteamedMilk()
            .build();
        assertEquals(8.0, beverage.cost());
    }
}
