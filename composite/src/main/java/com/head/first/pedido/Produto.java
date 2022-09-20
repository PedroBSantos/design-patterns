package com.head.first.pedido;

import java.util.Iterator;

public class Produto extends Pedido {

    private String name;
    private double price;

    public Produto(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calculatePrice() {
        return price;
    }

    @Override
    public Iterator<Pedido> createIterator() {
        return new NullIterator();
    }
}
