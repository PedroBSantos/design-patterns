package com.head.first.pizzaria.chicago;

import java.util.List;

import com.head.first.pizzaria.ingredientes.*;
import com.head.first.pizzaria.pizzas.PizzaIngredientFactory;

public class ChicacoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDoug();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
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
        return new FrozenClam();
    }
}
