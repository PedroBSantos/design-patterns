package com.head.first.restaurant;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<RestaurantMenuComponent> {

    private Stack<Iterator<RestaurantMenuComponent>> components = new Stack<>();

    public CompositeIterator(Iterator<RestaurantMenuComponent> iterator) {
        this.components.add(iterator);
    }

    @Override
    public boolean hasNext() {
        if (this.components.isEmpty()) {
            return false;
        }
        var topIterator = this.components.peek();
        if (!topIterator.hasNext()) {
            this.components.pop();
            return this.hasNext();
        }
        return true;
    }

    @Override
    public RestaurantMenuComponent next() {
        if (!this.hasNext()) {
            return null;
        }
        var iterator = this.components.peek();
        var component = iterator.next();
        if (component instanceof RestaurantMenu) {
            this.components.push(component.createIterator()); 
        }
        return component;
    }
}
