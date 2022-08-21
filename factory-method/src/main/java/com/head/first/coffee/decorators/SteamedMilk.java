package com.head.first.coffee.decorators;

import com.head.first.coffee.Coffee;

public class SteamedMilk extends CoffeeDecorator {

    public SteamedMilk(Coffee coffee, String name) {
        this.name = name;
        this.coffee = coffee;
    }

    @Override
    public String getName() {
        return coffee.getName();
    }

    @Override
    public double cost() {
        return 0.1 + coffee.cost();
    }
}
