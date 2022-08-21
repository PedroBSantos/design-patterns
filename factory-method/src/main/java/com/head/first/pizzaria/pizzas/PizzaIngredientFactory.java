package com.head.first.pizzaria.pizzas;

import java.util.List;

import com.head.first.pizzaria.ingredientes.Cheese;
import com.head.first.pizzaria.ingredientes.Clam;
import com.head.first.pizzaria.ingredientes.Dough;
import com.head.first.pizzaria.ingredientes.Pepperoni;
import com.head.first.pizzaria.ingredientes.Sauce;
import com.head.first.pizzaria.ingredientes.Veggie;

public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    List<Veggie> createVeggies();

    Pepperoni createPepperoni();

    Clam createClam();
}
