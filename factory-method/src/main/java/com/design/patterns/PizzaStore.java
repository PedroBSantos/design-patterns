package com.design.patterns;

import com.design.patterns.pizza.Pizza;
import com.design.patterns.pizza.PizzaFactory;

public class PizzaStore {
    
    private PizzaFactory pizzaFactory;

    public PizzaStore(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza() {
        return pizzaFactory.createPizza();
    }
}
