package com.head.first.pizzaria.california;

import java.util.List;

import com.head.first.pizzaria.ingredientes.*;
import com.head.first.pizzaria.pizzas.PizzaIngredientFactory;

public class CaliforniaPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new VeryThinCrust();
    }

    @Override
    public Sauce createSauce() {
        return new BruschettaSauce();
    }

    @Override
    public Cheese createCheese() {
        return new GoatCheese();
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
        return new Camari();
    }
}
