package com.head.first.domain.entities;

import com.head.first.domain.builders.PizzaModaCasaBuilder;

public class ModaCasaPizzaChain extends SaborPizzaChain {

    public ModaCasaPizzaChain() {
        super("Moda da Casa", new PizzaModaCasaBuilder());
    }
}
