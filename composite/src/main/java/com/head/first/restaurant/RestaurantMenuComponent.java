package com.head.first.restaurant;

import java.util.Iterator;

public abstract class RestaurantMenuComponent {

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        return false;
    }

    public String print() {
        throw new UnsupportedOperationException();
    }

    public void add(RestaurantMenuComponent restaurantMenuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(RestaurantMenuComponent restaurantMenuComponent) {
        throw new UnsupportedOperationException();
    }

    public RestaurantMenuComponent getChild(int position) {
        throw new UnsupportedOperationException();
    }

    public abstract Iterator<RestaurantMenuComponent> createIterator();
}
