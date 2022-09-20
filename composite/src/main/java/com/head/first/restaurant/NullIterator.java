package com.head.first.restaurant;

import java.util.Iterator;

public class NullIterator implements Iterator<RestaurantMenuComponent> {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public RestaurantMenuComponent next() {
        return null;
    }
}
