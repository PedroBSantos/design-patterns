package com.head.first.coffee.factories;

import com.head.first.coffee.Coffee;
import com.head.first.coffee.CoffeeType;

public abstract class CoffeeFactory {

    public abstract Coffee getCoffee();
    
    public static CoffeeFactory getInstance(CoffeeType coffeeType) {
        if (coffeeType == CoffeeType.DARK_ROAST) {
            return new DarkRoastFactory();
        }
        if (coffeeType == CoffeeType.DECAF) {
            return new DecafFactory();
        }
        if (coffeeType == CoffeeType.HOUSE_BLEND) {
            return new HouseBlendFactory();
        }
        throw new RuntimeException("No factory found for coffee type " + coffeeType);
    }
}
