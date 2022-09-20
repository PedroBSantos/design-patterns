package com.head.first.restaurant;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu implements RestaurantMenu {

    private final Map<String, MenuItem> menuItems;

    public CafeMenu() {
        this.menuItems = new HashMap<>();
        this.addItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato and fries", true, 3.99);
        this.addItem("Soup of the day", "A cup of soup of the day, with a side salad", false, 3.69);
        this.addItem("Burrito", "A large burrito, with whole pinto beans, salsa and gaucamole", true, 4.29);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        var menuItem = new MenuItem(name, description, vegetarian, price);
        this.menuItems.put(name, menuItem);
    }

    @Override
    public Iterator<MenuItem> createMenuIterator() {
        return this.menuItems.values().iterator();
    }
}
