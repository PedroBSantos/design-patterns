package com.head.first.after;

import com.head.first.after.behaivors.FlyBehaivor;
import com.head.first.after.behaivors.QuackBehaivor;

public abstract class Duck {

    protected FlyBehaivor flyBehaivor;
    protected QuackBehaivor quackBehaivor;

    protected Duck() {
    }

    public void setFlyBehaivor(FlyBehaivor flyBehaivor) {
        this.flyBehaivor = flyBehaivor;
    }

    public void setQuackBehaivor(QuackBehaivor quackBehaivor) {
        this.quackBehaivor = quackBehaivor;
    }

    public void quack() {
        this.quackBehaivor.quack();
    }

    public void fly() {
        this.flyBehaivor.fly();
    }

    public void swim() {

    }

    public abstract void display();
}
