package com.design.patterns;

import com.design.patterns.pizza.CheesePizzaFactory;

public class App {
    
    public static void main(String[] args) {
        var cheesePizzaFactory = new CheesePizzaFactory();
        var cheese = cheesePizzaFactory.createPizza();
        System.out.println(cheese.getClass().getSimpleName());
    }
}
