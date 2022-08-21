package com.head.first.coffee.decorators;

import com.head.first.coffee.Coffee;

public class Soy extends CoffeeDecorator {

    public Soy(Coffee coffee, String name) {
        this.name = name;
        this.coffee = coffee;
    }

    @Override
    public String getName() {
        return coffee.getName();
    }

    @Override
    public double cost() {
        return 0.2 + coffee.cost();
    }
}
