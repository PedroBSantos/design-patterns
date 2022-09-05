package com.head.first.drink;

import java.util.logging.Logger;

public class Coffee extends Drink {

    @Override
    public void brew() {
        Logger.getGlobal().info("Misturando o café na água fervente");
    }

    @Override
    public void pourInCup() {
        Logger.getGlobal().info("Colocando na xícara de café");
    }

    @Override
    public void addCondiments() {
        if (customerWantsCondiments()) {
            Logger.getGlobal().info("Adicionando leite e açucar");
        }
    }
}
