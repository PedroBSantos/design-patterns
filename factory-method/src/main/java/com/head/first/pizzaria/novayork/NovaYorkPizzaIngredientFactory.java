package com.head.first.pizzaria.novayork;

import java.util.List;

import com.head.first.pizzaria.ingredientes.*;
import com.head.first.pizzaria.pizzas.PizzaIngredientFactory;

public class NovaYorkPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDoug();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public List<Veggie> createVeggies() {
        return List.of(new Garlic(), new Onion(), new Mushroom(), new RedPepper());
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FreshClam();
    }
}
