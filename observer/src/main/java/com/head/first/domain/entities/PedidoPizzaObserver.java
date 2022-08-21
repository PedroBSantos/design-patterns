package com.head.first.domain.entities;

public class PedidoPizzaObserver implements Observer<Pizza> {

    private Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    @Override
    public void update(Pizza value) {
        this.pizza = value;
    }
}
