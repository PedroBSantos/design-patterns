package com.head.first.domain.entities;

import com.head.first.domain.builders.PizzaCalabresaBuilder;

public class CalabresaPizzaChain extends SaborPizzaChain {

    public CalabresaPizzaChain() {
        super("Calabresa", new PizzaCalabresaBuilder());
    }
}
