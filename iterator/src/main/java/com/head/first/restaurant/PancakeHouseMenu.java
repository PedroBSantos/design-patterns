package com.head.first.restaurant;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu implements RestaurantMenu {

    private List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        this.menuItems = new ArrayList<>();
        this.addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs and toast", true, 2.99);
        this.addItem("Regular Pancake Breakfast", "Pancakes with fried eggs and sausage", false, 2.99);
        this.addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
        this.addItem("Waffles", "Waffes with your choice of blueberries of strawbarries", true, 3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        var menuItem = new MenuItem(name, description, vegetarian, price);
        this.menuItems.add(menuItem);
    }

    @Override
    public Iterator<MenuItem> createMenuIterator() {
        return this.menuItems.iterator();
    }
}
