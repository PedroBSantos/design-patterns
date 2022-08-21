package com.head.first.coffee.decorators;

import com.head.first.coffee.Beverage;

public abstract class BeverageDecorator extends Beverage {

    @Override
    public abstract String getDescription();
}
