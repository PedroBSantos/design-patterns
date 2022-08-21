package com.head.first.coffee;

public class HouseBlend extends Coffee {

    public HouseBlend(String name) {
        this.name = name;
    }

    @Override
    public double cost() {
        return 3.50;
    }
}
