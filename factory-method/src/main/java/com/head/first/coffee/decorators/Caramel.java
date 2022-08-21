package com.head.first.coffee.decorators;

import com.head.first.coffee.Coffee;

public class Caramel extends CoffeeDecorator {

    public Caramel(Coffee coffee, String name) {
        this.coffee = coffee;
        this.name = name;
    }

    @Override
    public String getName() {
        return coffee.getName();
    }

    @Override
    public double cost() {
        return 0.5 + coffee.cost();
    }
}
