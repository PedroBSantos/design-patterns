package com.head.first.after;

import com.head.first.after.behaivors.FlyWithWings;
import com.head.first.after.behaivors.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.quackBehaivor = new Quack();
        this.flyBehaivor = new FlyWithWings();
    }

    @Override
    public void display() {
        
    }
}
