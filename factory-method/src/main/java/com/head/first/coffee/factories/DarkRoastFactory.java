package com.head.first.coffee.factories;

import com.head.first.coffee.Coffee;
import com.head.first.coffee.DarkRoast;

public class DarkRoastFactory extends CoffeeFactory {

    @Override
    public Coffee getCoffee() {
        return new DarkRoast("Dark Roast");
    }
}
