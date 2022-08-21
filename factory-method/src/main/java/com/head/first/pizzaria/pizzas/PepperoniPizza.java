package com.head.first.pizzaria.pizzas;

public class PepperoniPizza extends Pizza {

    private PizzaIngredientFactory pizzaIngredientFactory;

    public PepperoniPizza(String name, PizzaIngredientFactory pizzaIngredientFactory) {
        super(name);
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        this.pepperoni = this.pizzaIngredientFactory.createPepperoni();
        this.dough = this.pizzaIngredientFactory.createDough();
        this.sauce = this.pizzaIngredientFactory.createSauce();
        this.cheese = this.pizzaIngredientFactory.createCheese();
    }
}
