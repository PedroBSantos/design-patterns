package com.head.first;

import com.head.first.restaurant.MenuItem;
import com.head.first.restaurant.RestaurantMenu;
import com.head.first.restaurant.Waitress;

public class App {
    
    public static void main(String[] args) {
        var pancakeHouseMenu = new RestaurantMenu("PANCAKE HOUSE MENU", "Breakfast");
        var dinerMenu = new RestaurantMenu("DINER MENU", "Lunch");
        var cafeMenu = new RestaurantMenu("CAFÉ MENU", "Diner");
        var dessertMenu = new RestaurantMenu("DESSERT MENU", "Dessert");
        var menus = new RestaurantMenu("All menus", "All menus");
        menus.add(pancakeHouseMenu);
        menus.add(dinerMenu);
        menus.add(cafeMenu);
        dinerMenu.add(new MenuItem("Pasta", "Spaghetti with Marina Sauce and a slice of sourdough bread", true, 3.89));
        dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flakey crust, topped with vanilla ice cream", true, 1.59));
        dinerMenu.add(dessertMenu);
        var waitress = new Waitress(menus);
        System.out.println(waitress.printVegetarianMenu());
    }
}
