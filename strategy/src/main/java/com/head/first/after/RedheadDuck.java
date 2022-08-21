package com.head.first.after;

import com.head.first.after.behaivors.FlyWithWings;
import com.head.first.after.behaivors.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        this.quackBehaivor = new Quack();
        this.flyBehaivor = new FlyWithWings();
    }

    @Override
    public void display() {
        
    }
}
