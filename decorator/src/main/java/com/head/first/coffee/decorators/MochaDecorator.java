package com.head.first.coffee.decorators;

import com.head.first.coffee.Beverage;
import com.head.first.coffee.BeverageSize;

public class MochaDecorator extends BeverageDecorator {

    private Beverage beverage;

    public MochaDecorator(String description, Beverage beverage) {
        this.description = description;
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 1.25;
    }

    @Override
    public String getDescription() {
        return "Mocha, " + this.beverage.getDescription();
    }

    @Override
    public BeverageSize getSize() {
        return this.beverage.getSize();
    }
}
