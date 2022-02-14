package com.design.patterns.pizza;

public abstract class PizzaFactory {

    protected abstract Pizza cookie();

    public Pizza createPizza() {
        var pizza = cookie();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
