package com.head.first.coffee;

public class DarkRoast extends Coffee {

    public DarkRoast(String name) {
        this.name = name;
    }

    @Override
    public double cost() {
        return 5.0;
    }
}
