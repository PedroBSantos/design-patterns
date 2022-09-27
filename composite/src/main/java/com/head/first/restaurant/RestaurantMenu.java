package com.head.first.restaurant;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RestaurantMenu extends RestaurantMenuComponent {

    private String name;
    private String description;
    private List<RestaurantMenuComponent> menuComponents;
    private Iterator<RestaurantMenuComponent> iterator;

    public RestaurantMenu(String name, String description) {
        this.name = name;
        this.description = description;
        this.menuComponents = new ArrayList<>();
    }

    @Override
    public void add(RestaurantMenuComponent restaurantMenuComponent) {
        this.menuComponents.add(restaurantMenuComponent);
    }

    @Override
    public RestaurantMenuComponent getChild(int position) {
        return this.menuComponents.get(position);
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String print() {
        var printResult = new StringBuilder();
        printResult.append("\n").append(name).append(",  ").append(description).append(" ------------------------").append("\n");
        for (var restaurantMenuComponent : this.menuComponents) {
            printResult.append(restaurantMenuComponent.print());
        }
        return printResult.toString();
    }

    @Override
    public void remove(RestaurantMenuComponent restaurantMenuComponent) {
        this.menuComponents.remove(restaurantMenuComponent);
    }

    @Override
    public Iterator<RestaurantMenuComponent> createIterator() {
        if (this.iterator == null) {
            this.iterator = new CompositeIterator(this.menuComponents.iterator());
        }
        return this.iterator;
    }
}
