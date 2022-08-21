package com.head.first.pizzaria.pizzas;

import java.util.List;
import java.util.logging.Logger;

import com.head.first.pizzaria.ingredientes.Cheese;
import com.head.first.pizzaria.ingredientes.Clam;
import com.head.first.pizzaria.ingredientes.Dough;
import com.head.first.pizzaria.ingredientes.Pepperoni;
import com.head.first.pizzaria.ingredientes.Sauce;
import com.head.first.pizzaria.ingredientes.Veggie;

public abstract class Pizza {

    protected final String name;
    protected Dough dough;
    protected Sauce sauce;
    protected List<Veggie> toppings;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clam clam;

    public Pizza(String name) {
        this.name = name;
    }

    public abstract void prepare();

    public void bake() {
        Logger.getGlobal().info("Assar por 25 minutos a 350 graus");
    }

    public void cut() {
        Logger.getGlobal().info("Cortar a pizza em fatias diagonais");
    }

    public void box() {
        Logger.getGlobal().info("Colocar a pizza na caixa oficial da pizzaria");
    }

    public String getName() {
        return name;
    }
}
