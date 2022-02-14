package com.design.patterns.pizza;

public class VeggiePizzaFactory extends PizzaFactory {

    @Override
    protected Pizza cookie() {
        var pizza = new Veggie();
        return pizza;
    }
}
