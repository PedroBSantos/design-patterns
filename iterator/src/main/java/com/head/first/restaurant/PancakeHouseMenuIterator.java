package com.head.first.restaurant;

import java.util.List;

public class PancakeHouseMenuIterator implements MenuIterator {

    private List<MenuItem> menuItems;
    private int actualPosition;

    public PancakeHouseMenuIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return this.actualPosition < this.menuItems.size();
    }

    @Override
    public MenuItem next() {
        if (this.hasNext()) {
            var menuItem = this.menuItems.get(this.actualPosition);
            this.actualPosition++;
            return menuItem;
        }
        throw new RuntimeException("Iterator ends");
    }
}
