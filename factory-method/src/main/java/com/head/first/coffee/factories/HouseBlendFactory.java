package com.head.first.coffee.factories;

import com.head.first.coffee.Coffee;
import com.head.first.coffee.HouseBlend;

public class HouseBlendFactory extends CoffeeFactory {

    @Override
    public Coffee getCoffee() {
        return new HouseBlend("House Blend");
    }
}
