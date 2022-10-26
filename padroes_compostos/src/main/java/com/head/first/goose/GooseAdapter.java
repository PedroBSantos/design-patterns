package com.head.first.goose;

import com.head.first.Observable;
import com.head.first.QuackObserver;
import com.head.first.duck.Quackable;

public class GooseAdapter implements Quackable {

    private Observable observable;
    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.observable = new Observable(this);
        this.goose = goose;
    }

    @Override
    public void quack() {
        this.goose.honk();
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
}
