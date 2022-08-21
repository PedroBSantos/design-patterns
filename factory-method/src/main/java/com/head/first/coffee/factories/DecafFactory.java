package com.head.first.coffee.factories;

import com.head.first.coffee.Coffee;
import com.head.first.coffee.Decaf;

public class DecafFactory extends CoffeeFactory {

    @Override
    public Coffee getCoffee() {
        return new Decaf("Decaf");
    }
}
