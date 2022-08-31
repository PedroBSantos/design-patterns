package com.head.first.duck;

import java.util.logging.Logger;

public class MallardDuck implements Duck {

    @Override
    public void quack() {
        Logger.getGlobal().info("Quack");
    }

    @Override
    public void fly() {
        Logger.getGlobal().info("Flying");
    }
}
