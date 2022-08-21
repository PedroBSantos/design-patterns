package com.head.first.domain.builders;

import java.util.HashSet;
import java.util.Set;

import com.head.first.domain.entities.Borda;
import com.head.first.domain.entities.Pizza;
import com.head.first.domain.enums.Ingrediente;
import com.head.first.domain.enums.PizzaSize;
import com.head.first.domain.enums.PizzaType;

public abstract class PizzaBuilder {

    protected String sabor;
    protected Borda borda;
    protected PizzaSize pizzaSize;
    protected PizzaType pizzaType;
    protected Set<Ingrediente> ingredientes;
    protected int tempoFornoMin;

    protected PizzaBuilder() {
        this.ingredientes = new HashSet<Ingrediente>();
    }

    public abstract void prepararBorda(Borda borda);

    public abstract void prepararMassa(PizzaSize pizzaSize);

    public abstract void colocarIngredientes();

    public abstract void tempoForno();

    public Pizza tirarDoForno() {
        return new Pizza(this.sabor, this.borda, this.pizzaSize, this.pizzaType, this.ingredientes, this.tempoFornoMin);
    }
}
