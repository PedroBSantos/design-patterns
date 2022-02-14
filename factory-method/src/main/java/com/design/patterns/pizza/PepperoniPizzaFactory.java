package com.design.patterns.pizza;

public class PepperoniPizzaFactory extends PizzaFactory {

    @Override
    protected Pizza cookie() {
        var pizza = new Pepperoni();
        return pizza;
    }
}
