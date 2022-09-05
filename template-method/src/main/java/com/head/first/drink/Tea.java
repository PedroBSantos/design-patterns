package com.head.first.drink;

import java.util.logging.Logger;

public class Tea extends Drink {

    @Override
    public void brew() {
        Logger.getGlobal().info("Colocando o chá em infusão na água fervente");
    }

    @Override
    public void pourInCup() {
        Logger.getGlobal().info("Colocando o chá na xícara");
    }

    @Override
    public void addCondiments() {
        if (customerWantsCondiments()) {
            Logger.getGlobal().info("Adicionando limão");
        }
    }
}
