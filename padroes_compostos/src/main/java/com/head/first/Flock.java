package com.head.first;

import java.util.ArrayList;
import java.util.List;

import com.head.first.duck.Quackable;

public class Flock implements Quackable {

    private List<Quackable> quackables;

    public Flock() {
        this.quackables = new ArrayList<>();
    }

    public void add(Quackable quackable) {
        if (quackable == null) {
            return;
        }
        this.quackables.add(quackable);
    }

    @Override
    public void quack() {
        this.quackables.forEach(quackable -> quackable.quack());
    }

    @Override
    public void addQuackObserver(QuackObserver quackObserver) {
        this.quackables.forEach(quackable -> quackable.addQuackObserver(quackObserver));
    }

    @Override
    public void notifyObservers() {
        this.quackables.forEach(quackable -> quackable.notifyObservers());
    }
}
