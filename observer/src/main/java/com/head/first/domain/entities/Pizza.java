package com.head.first.domain.entities;

import java.util.List;
import java.util.Set;

import com.head.first.domain.enums.*;

public class Pizza {

    private final String sabor;
    private final Borda borda;
    private final PizzaSize size;
    private final PizzaType type;
    private final Set<Ingrediente> ingredientes;
    private final int tempoFornoMin;
    private CalculoValorPizza calculoValorPizza;

    public Pizza(String sabor, Borda borda, PizzaSize size, PizzaType type, Set<Ingrediente> ingredientes,
            int tempoFornoMin) {
        this.sabor = sabor;
        this.borda = borda;
        this.size = size;
        this.type = type;
        this.ingredientes = ingredientes;
        this.tempoFornoMin = tempoFornoMin;
    }

    public String getSabor() {
        return sabor;
    }

    public Borda getBorda() {
        return borda;
    }

    public PizzaSize getSize() {
        return size;
    }

    public PizzaType getType() {
        return type;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes.stream().toList();
    }

    public int getTempoFornoMin() {
        return tempoFornoMin;
    }

    public void setFormaCalculoPizza(CalculoValorPizza calculoValorPizza) {
        this.calculoValorPizza = calculoValorPizza;
    }

    public float calcularValor() {
        return this.calculoValorPizza.calcular(this);
    }

    public boolean possuiBorda() {
        return this.borda != null;
    }
}
