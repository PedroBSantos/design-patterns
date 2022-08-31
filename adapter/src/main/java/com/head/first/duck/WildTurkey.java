package com.head.first.duck;

import java.util.logging.Logger;

public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        Logger.getGlobal().info("Gobble gobble");
    }

    @Override
    public void fly() {
        Logger.getGlobal().info("Flying a short distance");
    }
}
