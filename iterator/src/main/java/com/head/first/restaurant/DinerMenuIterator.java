package com.head.first.restaurant;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {

    private MenuItem[] menuItems;
    private int actualPosition;
    private int numberOfItems;

    public DinerMenuIterator(MenuItem[] menuItems, int numberOfItems) {
        this.menuItems = menuItems;
        this.actualPosition = 0;
        this.numberOfItems = numberOfItems;
    }

    @Override
    public boolean hasNext() {
        return this.actualPosition < this.numberOfItems;
    }

    @Override
    public MenuItem next() {
        if (this.hasNext()) {
            var menuItem = this.menuItems[this.actualPosition];
            this.actualPosition++;
            return menuItem;
        }
        throw new RuntimeException("Iterator ends");
    }
}
