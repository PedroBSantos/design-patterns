package com.head.first.duck;

import java.util.logging.Logger;

import com.head.first.Observable;
import com.head.first.QuackObserver;

public class MallardDuck implements Quackable {

    private Observable observable;

    public MallardDuck() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        Logger.getGlobal().info("quack");
        this.notifyObservers();
    }

    @Override
    public void addQuackObserver(QuackObserver quackObserver) {
        this.observable.addQuackObserver(quackObserver);
    }

    @Override
    public void notifyObservers() {
        this.observable.notifyObservers();
    }

    @Override
    public String toString() {
        return MallardDuck.class.getSimpleName();
    }
}
