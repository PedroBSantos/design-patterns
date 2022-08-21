package com.head.first.coffee.builder;

import com.head.first.coffee.Beverage;
import com.head.first.coffee.BeverageSize;
import com.head.first.coffee.DarkRoast;
import com.head.first.coffee.Decaf;
import com.head.first.coffee.Espresso;
import com.head.first.coffee.HouseBlend;
import com.head.first.coffee.decorators.CaramelDecorator;
import com.head.first.coffee.decorators.MochaDecorator;
import com.head.first.coffee.decorators.SoyDecorator;
import com.head.first.coffee.decorators.SteamedMilkDecorator;

public class CoffeeBuilder implements CondimentBuilder {

    private Beverage beverage;

    public CondimentBuilder oneDarkRoast(BeverageSize beverageSize) {
        this.beverage = new DarkRoast("Dark Roast", beverageSize);
        return this;
    }

    public CondimentBuilder oneDecaf(BeverageSize beverageSize) {
        this.beverage = new Decaf("Decaf", beverageSize);
        return this;
    }

    public CondimentBuilder oneEspresso(BeverageSize beverageSize) {
        this.beverage = new Espresso("Espresso", beverageSize);
        return this;
    }

    public CondimentBuilder oneHouseBlend(BeverageSize beverageSize) {
        this.beverage = new HouseBlend("House Blend", beverageSize);
        return this;
    }

    @Override
    public CondimentBuilder withCaramel() {
        this.beverage = new CaramelDecorator("Caramel Side", beverage);
        return this;
    }

    @Override
    public CondimentBuilder withMocha() {
        this.beverage = new MochaDecorator("Mocha Side", beverage);
        return this;
    }

    @Override
    public CondimentBuilder withSoy() {
        this.beverage = new SoyDecorator("Soy Side", beverage);
        return this;
    }

    @Override
    public CondimentBuilder withSteamedMilk() {
        this.beverage = new SteamedMilkDecorator("Steamed Milk Side", beverage);
        return this;
    }

    @Override
    public Beverage build() {
        return this.beverage;
    }
}
