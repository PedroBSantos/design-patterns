package com.head.first.decorator;

import com.head.first.QuackObserver;
import com.head.first.duck.Quackable;

public class QuackCounterDecorator implements Quackable {

    private static int quackCounter = 0;
    private Quackable quackable;

    public QuackCounterDecorator(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        this.quackable.quack();
        QuackCounterDecorator.quackCounter++;
    }

    public static int getQuackCounter() {
        return QuackCounterDecorator.quackCounter;
    }

    @Override
    public void addQuackObserver(QuackObserver quackObserver) {
        this.quackable.addQuackObserver(quackObserver);
    }

    @Override
    public void notifyObservers() {
        this.quackable.notifyObservers();
    }
}
