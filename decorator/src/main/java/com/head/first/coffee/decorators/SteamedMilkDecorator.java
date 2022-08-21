package com.head.first.coffee.decorators;

import com.head.first.coffee.Beverage;
import com.head.first.coffee.BeverageSize;

public class SteamedMilkDecorator extends BeverageDecorator {

    private Beverage beverage;

    public SteamedMilkDecorator(String description, Beverage beverage) {
        this.beverage = beverage;
        this.description = description;
    }
    
    @Override
    public double cost() {
        return this.beverage.cost() + 0.50;
    }

    @Override
    public String getDescription() {
        return "Steamed milk, " + this.beverage.getDescription();
    }

    @Override
    public BeverageSize getSize() {
        return this.beverage.getSize();
    }
}
