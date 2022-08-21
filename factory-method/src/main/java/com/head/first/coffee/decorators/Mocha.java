package com.head.first.coffee.decorators;

import com.head.first.coffee.Coffee;

public class Mocha extends CoffeeDecorator {

    public Mocha(Coffee coffee, String name) {
        this.coffee = coffee;
        this.name = name;
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
