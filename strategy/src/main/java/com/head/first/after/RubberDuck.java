package com.head.first.after;

import com.head.first.after.behaivors.FlyNoWay;
import com.head.first.after.behaivors.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        this.quackBehaivor = new Squeak();
        this.flyBehaivor = new FlyNoWay();
    }

    @Override
    public void display() {
        
    }
}
