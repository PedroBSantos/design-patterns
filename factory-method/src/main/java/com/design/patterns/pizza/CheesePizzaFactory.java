package com.design.patterns.pizza;

public class CheesePizzaFactory extends PizzaFactory {

    @Override
    protected Pizza cookie() {
        var pizza = new Cheese();
        return pizza;
    }
}
