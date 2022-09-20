package com.head.first.restaurant;

import java.util.Iterator;

public class Waitress {

    private final RestaurantMenu pancakeHouseMenu;
    private final RestaurantMenu dinerMenu;
    private final RestaurantMenu cafeMenu;

    public Waitress(RestaurantMenu pancakeHouseMenu, RestaurantMenu dinerMenu, RestaurantMenu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public String printMenu() {
        var pancakeHouseMenuIterator = this.pancakeHouseMenu.createMenuIterator();
        var dinerMenuIterator = this.dinerMenu.createMenuIterator();
        var cafeMenuIterator = this.cafeMenu.createMenuIterator();
        var menuBuilder = new StringBuilder();
        menuBuilder.append(this.printMenu(pancakeHouseMenuIterator))
            .append("\n")
            .append(this.printMenu(dinerMenuIterator))
            .append("\n")
            .append(this.printMenu(cafeMenuIterator));
        return menuBuilder.toString();
    }

    private String printMenu(Iterator<MenuItem> menuIterator) {
        var menuBuilder = new StringBuilder();
        do {
            var menuItem = menuIterator.next();
            menuBuilder.append(menuItem.getName()).append("\n");
        } while (menuIterator.hasNext());
        return menuBuilder.toString();
    }
}
