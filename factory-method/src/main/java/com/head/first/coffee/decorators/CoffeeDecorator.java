package com.head.first.coffee.decorators;

import com.head.first.coffee.Coffee;

public abstract class CoffeeDecorator extends Coffee {
    
    protected Coffee coffee;

    public abstract String getName();

    public abstract double cost();
}
