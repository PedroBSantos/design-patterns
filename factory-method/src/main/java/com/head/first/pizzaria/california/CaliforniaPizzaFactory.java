package com.head.first.pizzaria.california;

import com.head.first.pizzaria.pizzas.*;

public class CaliforniaPizzaFactory extends PizzaFactory {

    private PizzaIngredientFactory pizzaIngredientFactory;

    public CaliforniaPizzaFactory() {
        this.pizzaIngredientFactory = new CaliforniaPizzaIngredientFactory();
    }

    @Override
    protected Pizza createPizza(String tipo) {
        Pizza pizza = null;
        if ("cheese".equals(tipo)) {
            pizza = new CheesePizza("Pizza de queijo no estilo de California", this.pizzaIngredientFactory);
        }
        if ("pepperoni".equals(tipo)) {
            pizza = new PepperoniPizza("Pizza de calabresa no estilo de California", this.pizzaIngredientFactory);
        }
        if ("clam".equals(tipo)) {
            pizza = new ClamPizza("Pizza de mariscos no estilo de California", this.pizzaIngredientFactory);
        }
        if ("veggie".equals(tipo)) {
            pizza = new VeggiePizza("Pizza vegetariana no estilo de California", this.pizzaIngredientFactory);
        }
        return pizza;
    }
}
