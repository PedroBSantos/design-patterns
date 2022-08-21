package com.head.first.pizzaria.pizzas;

public class VeggiePizza extends Pizza {

    private PizzaIngredientFactory pizzaIngredientFactory;

    public VeggiePizza(String name, PizzaIngredientFactory pizzaIngredientFactory) {
        super(name);
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        this.toppings = this.pizzaIngredientFactory.createVeggies();
        this.dough = this.pizzaIngredientFactory.createDough();
        this.sauce = this.pizzaIngredientFactory.createSauce();
    }
}
