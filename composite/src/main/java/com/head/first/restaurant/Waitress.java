package com.head.first.restaurant;

public class Waitress {

    private RestaurantMenuComponent restaurantMenus;

    public Waitress(RestaurantMenuComponent restaurantMenus) {
        this.restaurantMenus = restaurantMenus;
    }

    public String printMenu() {
        return this.restaurantMenus.print();
    }

    public String printVegetarianMenu() {
        var iterator = this.restaurantMenus.createIterator();
        var vegetarianItens = new StringBuilder();
        vegetarianItens.append("\nVEGETARIAN MENU\n");
        while (iterator.hasNext()) {
            var menuComponent = iterator.next();
            if (menuComponent.isVegetarian()) {
                vegetarianItens.append(menuComponent.print());
                vegetarianItens.append("\n");
            }
        }
        return vegetarianItens.toString();
    }
}
