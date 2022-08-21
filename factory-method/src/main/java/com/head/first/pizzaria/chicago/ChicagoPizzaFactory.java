package com.head.first.pizzaria.chicago;

import com.head.first.pizzaria.pizzas.*;

public class ChicagoPizzaFactory extends PizzaFactory {

    private PizzaIngredientFactory pizzaIngredientFactory;

    public ChicagoPizzaFactory() {
        this.pizzaIngredientFactory = new ChicacoPizzaIngredientFactory();
    }

    @Override
    protected Pizza createPizza(String tipo) {
        Pizza pizza = null;
        if ("cheese".equals(tipo)) {
            pizza = new CheesePizza("Pizza de queijo no estilo de Chicago", this.pizzaIngredientFactory);
        }
        if ("pepperoni".equals(tipo)) {
            pizza = new PepperoniPizza("Pizza de calabresa no estilo de Chicago", this.pizzaIngredientFactory);
        }
        if ("clam".equals(tipo)) {
            pizza = new ClamPizza("Pizza de mariscos no estilo de Chicago", this.pizzaIngredientFactory);
        }
        if ("veggie".equals(tipo)) {
            pizza = new VeggiePizza("Pizza vegetariana no estilo de Chicago", this.pizzaIngredientFactory);
        }
        return pizza;
    }
}
