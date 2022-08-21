package com.head.first.domain.entities;

import com.head.first.domain.builders.PizzaBuilder;
import com.head.first.domain.enums.PizzaSize;

public abstract class SaborPizzaChain {

    protected String sabor;
    protected PizzaBuilder pizzaBuilder;
    protected SaborPizzaChain proximoSabor;

    protected SaborPizzaChain(String sabor, PizzaBuilder pizzaBuilder) {
        this.sabor = sabor;
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza obterPizza(String sabor, Borda borda, PizzaSize pizzaSize) {
        if (this.sabor.equals(sabor)) {
            return this.montarPizza(sabor, borda, pizzaSize);
        }
        if (this.proximoSabor == null) {
            throw new RuntimeException("Builder para o sabor " + sabor + " não encontrado");
        }
        return this.proximoSabor.obterPizza(sabor, borda, pizzaSize);
    }

    public void adicionarProximoSabor(SaborPizzaChain proximoSabor) {
        this.proximoSabor = proximoSabor;
    }

    protected Pizza montarPizza(String sabor, Borda borda, PizzaSize pizzaSize) {
        this.pizzaBuilder.prepararBorda(borda);
        this.pizzaBuilder.prepararMassa(pizzaSize);
        this.pizzaBuilder.colocarIngredientes();
        this.pizzaBuilder.tempoForno();
        return this.pizzaBuilder.tirarDoForno();
    }
}
