package com.head.first.restaurant;

import java.util.Iterator;
import java.util.logging.Logger;

public class DinerMenu implements RestaurantMenu {

    public static final int MAX_ITEMS = 6;
    private int numberOfItems;
    private MenuItem[] menuItems;

    public DinerMenu() {
        this.menuItems = new MenuItem[MAX_ITEMS];
        this.addItem("Vegetarian BLT", "(Fakin's) Bacon with lettuce & tomato on whole wheat", true, 2.99);
        this.addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        this.addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29);
        this.addItem("Hotdog", "A hotdog, with saurkraut, relish, onions, topped with cheese", false, 3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        var menuItem = new MenuItem(name, description, vegetarian, price);
        if (this.numberOfItems >= MAX_ITEMS) {
            Logger.getGlobal().severe("Sorry, menu is full! Can't add item to menu");
            return;
        }
        this.menuItems[this.numberOfItems] = menuItem;
        this.numberOfItems++;
    }

    @Override
    public Iterator<MenuItem> createMenuIterator() {
        return new DinerMenuIterator(this.menuItems, this.numberOfItems);
    }
}
