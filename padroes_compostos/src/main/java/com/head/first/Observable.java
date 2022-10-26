package com.head.first;

import java.util.ArrayList;
import java.util.List;

import com.head.first.duck.Quackable;

public class Observable implements QuackSubject {

    private Quackable quackable;
    private List<QuackObserver> quackObservers;

    public Observable(Quackable quackable) {
        this.quackable = quackable;
        this.quackObservers = new ArrayList<>();
    }

    @Override
    public void addQuackObserver(QuackObserver quackObserver) {
        if (quackObserver == null) {
            return;
        }
        this.quackObservers.add(quackObserver);
    }

    @Override
    public void notifyObservers() {
        this.quackObservers.forEach(quackObserver -> quackObserver.update(this.quackable));
    }
}
