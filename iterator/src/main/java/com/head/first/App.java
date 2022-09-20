package com.head.first;

import com.head.first.restaurant.CafeMenu;
import com.head.first.restaurant.DinerMenu;
import com.head.first.restaurant.PancakeHouseMenu;
import com.head.first.restaurant.Waitress;

public class App {
    
    public static void main(String[] args) {
        var pancakeHouseMenu = new PancakeHouseMenu();
        var dinerMenu = new DinerMenu();
        var cafeMenu = new CafeMenu();
        var waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
        System.out.println(waitress.printMenu());
    }
}
