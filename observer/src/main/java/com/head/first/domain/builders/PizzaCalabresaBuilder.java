package com.head.first.domain.builders;

import com.head.first.domain.entities.Borda;
import com.head.first.domain.enums.Ingrediente;
import com.head.first.domain.enums.PizzaSize;
import com.head.first.domain.enums.PizzaType;

public class PizzaCalabresaBuilder extends PizzaBuilder {

    @Override
    public void prepararBorda(Borda borda) {
        this.borda = borda;
    }

    @Override
    public void prepararMassa(PizzaSize pizzaSize) {
        this.pizzaSize = pizzaSize;
        this.pizzaType = PizzaType.SALGADA;
    }

    @Override
    public void colocarIngredientes() {
        this.sabor = "Calabresa";
        this.ingredientes.add(Ingrediente.CALABRESA);
        this.ingredientes.add(Ingrediente.AZEITONA);
        this.ingredientes.add(Ingrediente.CEBOLA);
        this.ingredientes.add(Ingrediente.CHEDDAR);
        this.ingredientes.add(Ingrediente.SALAME);
    }

    @Override
    public void tempoForno() {
        this.tempoFornoMin = 20;
    }
}
