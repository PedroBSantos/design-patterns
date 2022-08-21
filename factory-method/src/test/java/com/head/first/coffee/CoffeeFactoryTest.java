package com.head.first.coffee;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.head.first.coffee.factories.CoffeeFactory;

public class CoffeeFactoryTest {
    
    @Test
    @DisplayName("Deveria criar a dark roast")
    public void test1() {
        var coffee = CoffeeFactory
            .getInstance(CoffeeType.DARK_ROAST)
            .getCoffee();
        assertTrue(coffee instanceof DarkRoast);
    }

    @Test
    @DisplayName("Deveria criar a decaf")
    public void test2() {
        var coffee = CoffeeFactory
            .getInstance(CoffeeType.DECAF)
            .getCoffee();
        assertTrue(coffee instanceof Decaf);
    }

    @Test
    @DisplayName("Deveria criar a house blend")
    public void test3() {
        var coffee = CoffeeFactory
            .getInstance(CoffeeType.HOUSE_BLEND)
            .getCoffee();
        assertTrue(coffee instanceof HouseBlend);
    }
}
