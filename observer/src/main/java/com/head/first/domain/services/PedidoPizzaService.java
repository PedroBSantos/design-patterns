package com.head.first.domain.services;

import com.head.first.domain.entities.Borda;
import com.head.first.domain.entities.CalculoValorPizza;
import com.head.first.domain.entities.Pizza;
import com.head.first.domain.entities.SaborPizzaChain;
import com.head.first.domain.entities.Subject;
import com.head.first.domain.enums.PizzaSize;

public class PedidoPizzaService extends Subject<Pizza> {

    private SaborPizzaChain saborPizzaChain;
    private CalculoValorPizza calculoValorPizza;
    
    public PedidoPizzaService(SaborPizzaChain saborPizzaChain, CalculoValorPizza calculoValorPizza) {
        this.saborPizzaChain = saborPizzaChain;
        this.calculoValorPizza = calculoValorPizza;
    }

    public void criarPedido(String sabor, Borda borda, PizzaSize pizzaSize) {
        var pizza = this.saborPizzaChain.obterPizza(sabor, borda, pizzaSize);
        pizza.setFormaCalculoPizza(calculoValorPizza);
        this.notifyObservers(pizza);
    }
}
