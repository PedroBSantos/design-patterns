package com.head.first.after;

import com.head.first.after.behaivors.FlyNoWay;
import com.head.first.after.behaivors.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        this.quackBehaivor = new MuteQuack();
        this.flyBehaivor = new FlyNoWay();
    }

    @Override
    public void display() {

    }
}
