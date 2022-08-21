package com.head.first.coffee;

public class Decaf extends Coffee {

    public Decaf(String name) {
        this.name = name;
    }

    @Override
    public double cost() {
        return 2.50;
    }
}
