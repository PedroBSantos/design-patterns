package com.head.first.pizzaria.novayork;

import com.head.first.pizzaria.pizzas.*;

public class NovaYorkPizzaFactory extends PizzaFactory {

    private PizzaIngredientFactory pizzaIngredientFactory;

    public NovaYorkPizzaFactory() {
        this.pizzaIngredientFactory = new NovaYorkPizzaIngredientFactory();
    }

    @Override
    protected Pizza createPizza(String tipo) {
        Pizza pizza = null;
        if ("cheese".equals(tipo)) {
            pizza = new CheesePizza("Pizza de queijo no estilo de Nova York", this.pizzaIngredientFactory);
        }
        if ("pepperoni".equals(tipo)) {
            pizza = new PepperoniPizza("Pizza de calabresa no estilo de Nova York", this.pizzaIngredientFactory);
        }
        if ("clam".equals(tipo)) {
            pizza = new ClamPizza("Pizza de mariscos no estilo de Nova York", this.pizzaIngredientFactory);
        }
        if ("veggie".equals(tipo)) {
            pizza = new VeggiePizza("Pizza vegetariana no estilo de Nova York", this.pizzaIngredientFactory);
        }
        return pizza;
    }
}
