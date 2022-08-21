package com.head.first.pizzaria.pizzas;

import java.util.logging.Logger;

public class CheesePizza extends Pizza {

    private PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(String name, PizzaIngredientFactory pizzaIngredientFactory) {
        super(name);
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        Logger.getGlobal().info("Preparando: " + this.name);
        this.cheese = this.pizzaIngredientFactory.createCheese();
        this.clam = this.pizzaIngredientFactory.createClam();
        this.dough = this.pizzaIngredientFactory.createDough();
        this.pepperoni = this.pizzaIngredientFactory.createPepperoni();
        this.sauce = this.pizzaIngredientFactory.createSauce();
        this.toppings = this.pizzaIngredientFactory.createVeggies();
    }
}
