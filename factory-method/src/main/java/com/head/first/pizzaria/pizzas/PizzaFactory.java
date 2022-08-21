package com.head.first.pizzaria.pizzas;

public abstract class PizzaFactory {

    protected PizzaIngredientFactory pizzaIngredientFactory;

    public final Pizza orderPizza(String tipo) {
        var pizza = this.createPizza(tipo);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String tipo);
}
