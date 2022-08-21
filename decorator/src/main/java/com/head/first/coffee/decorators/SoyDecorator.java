package com.head.first.coffee.decorators;

import com.head.first.coffee.Beverage;
import com.head.first.coffee.BeverageSize;

public class SoyDecorator extends BeverageDecorator {

    private Beverage beverage;

    public SoyDecorator(String description, Beverage beverage) {
        this.description = description;
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        var cost = this.beverage.cost();
        if (getSize() == BeverageSize.TALL) {
            cost += 0.10;
        }
        if (getSize() == BeverageSize.GRANDE) {
            cost += 0.15;
        }
        if (getSize() == BeverageSize.VENTI) {
            cost += 0.20;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return "Soy, " + this.beverage.getDescription();
    }

    @Override
    public BeverageSize getSize() {
        return this.beverage.getSize();
    }
}
