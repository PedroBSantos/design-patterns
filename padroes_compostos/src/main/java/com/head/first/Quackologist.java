package com.head.first;

import java.util.logging.Logger;

import com.head.first.duck.Quackable;

public class Quackologist implements QuackObserver {

    @Override
    public void update(Quackable quackable) {
        Logger.getGlobal().info("Quack from " + quackable);
    }
}
