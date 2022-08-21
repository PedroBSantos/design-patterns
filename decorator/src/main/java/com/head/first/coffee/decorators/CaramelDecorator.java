package com.head.first.coffee.decorators;

import com.head.first.coffee.Beverage;
import com.head.first.coffee.BeverageSize;

public class CaramelDecorator extends BeverageDecorator {

    private Beverage beverage;

    public CaramelDecorator(String description, Beverage beverage) {
        this.description = description;
        this.beverage = beverage;
    }
    
    @Override
    public double cost() {
        return this.beverage.cost() + 2.50;
    }

    @Override
    public String getDescription() {
        return "Caramel, " + this.beverage.getDescription();
    }

    @Override
    public BeverageSize getSize() {
        return this.beverage.getSize();
    }
}
