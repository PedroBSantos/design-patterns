package com.head.first.drink;

import java.util.logging.Logger;
import java.util.Scanner;

public abstract class Drink {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public void boilWater() {
        Logger.getGlobal().info("Fervendo a água");
    }

    public abstract void brew();

    public abstract void pourInCup();

    public abstract void addCondiments();

    public boolean customerWantsCondiments() {
        return "Y".equals(getCustomerCondimentsAwnser());
    }

    private String getCustomerCondimentsAwnser() {
        var scanner = new Scanner(System.in);
        var answer = scanner.nextLine().trim();
        scanner.close();
        return answer;
    }
}
